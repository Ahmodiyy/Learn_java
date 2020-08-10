package EssentialClasses.concurrency;

public class MyThreadCooperation {
    int b =1;
     int a =2;
    boolean waitCondition = false;
    public synchronized  void oddWaiting(){
        while (waitCondition){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(b);
        waitCondition = true;
        notify();

    }

    public synchronized void evenWaititng(){
        while (!waitCondition){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(a);
        waitCondition = false;
       notify();
    }

    void calling(){
        Odd odd = new Odd();
        Even even = new Even();
        Thread thread1 = new Thread(odd);
        thread1.setName("ODD");
        Thread thread2 = new Thread(even);
        thread2.setName("EVEN");

        thread1.start();
        thread2.start();
    }
    public class Odd implements Runnable{
      void printingOdd() {
            for (b = 1; b < 10; b = b + 2) {
                oddWaiting();
            }
        }

        @Override
        public void run() {
            printingOdd();
        }
    }

    public class Even implements Runnable{
       void printingEven() {
           for (a = 2; a < 10; a = a + 2) {
               evenWaititng();
           }
       }

        @Override
        public void run() {
            printingEven();
        }
    }
    public static void main(String[] args) {
   MyThreadCooperation myThreadCooperation = new MyThreadCooperation();
   myThreadCooperation.calling();

    }
}
