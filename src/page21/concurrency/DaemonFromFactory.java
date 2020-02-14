package page21.concurrency;

import net.mindview.util.DaemonThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable{

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " " + this);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());

        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory());
        }


        exec.shutdown();

        TimeUnit.SECONDS.sleep(1);
        System.out.println("start in mian");

    }

}
