package page21.concurrency;

public class SynchronizedEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    public synchronized  int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }

}
