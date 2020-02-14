package page21.concurrency;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {
    private Chopstick left;
    private Chopstick right;
    private final int id;
    private final int ponderFacotr;
    private Random rand = new Random(47);

    private void pause() throws InterruptedException {
        if (ponderFacotr == 0) {
            return;
        }
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(ponderFacotr * 250));
    }

    public Philosopher(Chopstick left, Chopstick right, int id, int ponderFacotr) {
        this.left = left;
        this.right = right;
        this.id = id;
        this.ponderFacotr = ponderFacotr;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(this + " " + "thinking");
                pause();
                System.out.println(this + " " + "grabbing right");
                right.take();
                System.out.println(this + " " + "grabbing left");
                left.take();
                System.out.println(this + " " + "eating");
                pause();
                right.drop();
                left.drop();

            }
        } catch (InterruptedException e) {
            System.out.println(this + "exiting via interrupt");
        }
    }

    @Override
    public String toString() {
        return "Philosopher" + id;
    }
}
