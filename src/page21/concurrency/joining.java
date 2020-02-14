package page21.concurrency;

import java.util.concurrent.TimeUnit;

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted. isInterrupted(): " + this.isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println(getName() + " Join completed");

    }
}

public class joining {
    public static void main(String[] args) {
        Sleeper sleepey = new Sleeper("Sleepey", 1500);
        Sleeper grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey", sleepey);
        Joiner doc = new Joiner("doc", grumpy);
        grumpy.interrupt();



    }
}
