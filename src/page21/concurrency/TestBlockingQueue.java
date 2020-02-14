package page21.concurrency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

class LiftOffRunning implements Runnable {
    private BlockingQueue<LiftOff> rockets;

    public LiftOffRunning(BlockingQueue<LiftOff> queue) {
        rockets = queue;
    }

    public void add(LiftOff lo) {

        try {
            rockets.put(lo);
        } catch (InterruptedException e) {
            System.out.println("Interrupted during put()");
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        } catch (InterruptedException e) {
            System.out.println("Waking from take()");
        }
        System.out.println("Exiting LiftOffRunner");
    }
}

public class TestBlockingQueue {

    static void getkey() {
        try {
            new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void getkey(String message) {
        System.out.println("message: " + message);
        getkey();
    }

    static void test(String msg, BlockingQueue<LiftOff> queue) throws InterruptedException {
        System.out.println(msg);
        LiftOffRunning runner = new LiftOffRunning(queue);
        Thread t = new Thread(runner);
        t.start();
        for (int i = 0; i < 5; i++) {
            runner.add(new LiftOff(5));
        }
        TimeUnit.SECONDS.sleep(1);
        getkey("Press 'Enter' ( " + msg + ")");
        t.interrupt();
        System.out.println("Finished " + msg + " test");
    }

    public static void main(String[] args) throws InterruptedException {
        test("LinkedBlockingQueue", new LinkedBlockingQueue<LiftOff>());
        test("ArrayBlockingQueue", new ArrayBlockingQueue<LiftOff>(3));
        test("SyncronousQueue", new SynchronousQueue<LiftOff>());

    }

}
