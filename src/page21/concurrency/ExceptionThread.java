package page21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException("my-exception");
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        exec.execute(new ExceptionThread());

        exec.shutdown();
    }
}
