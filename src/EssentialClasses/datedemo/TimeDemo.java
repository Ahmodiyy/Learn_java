package EssentialClasses.datedemo;


import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class TimeDemo {
    public static void main(String[] args) {
      LocalTime localTime = LocalTime.of(00, 00, 10);
        for(long s= 0; s<11; s++) {
            System.out.println(localTime.minusSeconds(s));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}

