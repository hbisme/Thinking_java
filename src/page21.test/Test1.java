package page21.test;

public class Test1 implements Runnable {

    public Test1() {

    }

    @Override
    public void run() {
        System.out.println("statr Thread:" + Thread.currentThread().getId() + " test run");

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread:" + Thread.currentThread().getId() + ", in Test1's " + i + " run");
            Thread.yield();
        }

        System.out.println("stoped test run");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Test1());
            t.start();
        }

    }
}
