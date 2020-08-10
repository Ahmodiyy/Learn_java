package EssentialClasses.concurrency;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.TimeUnit;

public class FirstConcurrencyDemo extends  Thread {

        public void run() {
//
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            for (int f = 0; f < 10; f++) {
                System.out.println("going");
            }
            System.out.println("gone");
        }

       static class FirstConcurrencyDemo2 implements Runnable {
            @Override
            public void run() {
                System.out.println(Thread.interrupted());
                for (int f = 0; f < 10; f++) {
                    System.out.println(Thread.currentThread().getName());
                    if(f == 5){

                    }
                }
                System.out.println("gone1");
            }
        }


    public static void main(String[] args) {
            // thread using thread clasa
     FirstConcurrencyDemo firstConcurrencyDemo = new FirstConcurrencyDemo();
        System.out.println(firstConcurrencyDemo.getPriority());
     firstConcurrencyDemo.start();
        //Thread.sleep(4000);
        //  TimeUnit.SECONDS.sleep(4000);



// thread using runnable interface
     FirstConcurrencyDemo2 firstConcurrencyDemo2 = new FirstConcurrencyDemo2();
     Thread thread2 = new Thread(firstConcurrencyDemo2);
     thread2.setName("thread 2");

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     thread2.setPriority(5);
     thread2.start();

        System.out.println("inside main");
        firstConcurrencyDemo.interrupt();

    }
}
