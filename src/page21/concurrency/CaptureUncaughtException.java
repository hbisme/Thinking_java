package page21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class ExceptionThread2 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by: " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException("my-exception");
    }
}

class MyUncacughExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.println(" 捕捉 " + e);

    }
}

class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + " createion new Thread");
        Thread t = new Thread(r);
        System.out.println(" create " + t);
        t.setUncaughtExceptionHandler(new MyUncacughExceptionHandler());
        System.out.println("newThread eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}

public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        exec.execute(new ExceptionThread2());

        exec.shutdown();


    }
}
