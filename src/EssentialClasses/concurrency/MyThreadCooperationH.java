package EssentialClasses.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class MyThreadCooperationH {
    int b = 1;
    int a = 2;
    boolean waitCondition = false;
    //locking and cooperation using Lock interface and Condition interface respectively
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();


    private void oddWaiting() {
        lock.lock();
        try {
            while (waitCondition) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(b);
            waitCondition = true;
            condition.signal();
        }
        finally {
            lock.unlock();
        }

    }

    private void evenWaititng() {
        lock.lock();
        try {
            while (!waitCondition) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(a);
            waitCondition = false;
           condition.signal();
        }
        finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        MyThreadCooperation myThreadCooperation = new MyThreadCooperation();

        OddH oddh = new OddH(myThreadCooperation);
        EvenH evenh = new EvenH(myThreadCooperation);

        Thread thread1 = new Thread(oddh);
        thread1.setName("ODD");
        Thread thread2 = new Thread(evenh);
        thread2.setName("EVEN");

        thread1.start();
        thread2.start();
    }
}
