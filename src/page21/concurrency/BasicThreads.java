package page21.concurrency;

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiffOff());
        t.start();

        System.out.println("Waiting for LiftOff");


    }
}
