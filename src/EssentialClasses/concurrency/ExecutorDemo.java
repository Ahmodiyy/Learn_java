package EssentialClasses.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorDemo implements Executor{
    @Override
    public void execute(Runnable command) {

    }
    public static void main(String[] args) {
        Executor executor = new ExecutorDemo();
    //    ExecutorService executorService = newFixed
        ExecutorService executorService = Executors.newFixedThreadPool(2);

    }


}


