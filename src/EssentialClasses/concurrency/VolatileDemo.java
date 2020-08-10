package EssentialClasses.concurrency;

import java.util.concurrent.TimeUnit;

public class VolatileDemo {
    public static volatile boolean stop;
    public static void main(String[] args) {
        new Thread(() -> {
            while(!stop ){
                System.out.println("in while...");
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }
}
