package page12.exceptions;


class NeedsCleanup_this {
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup_this {
    public NeedsCleanup2() {
    }
}

public class CleanupIdiom {
    public static void main(String[] args) {

        // 第一种方式
        NeedsCleanup_this nc1 = new NeedsCleanup_this();

        try {

        } finally {
            nc1.dispose();
        }

        // 第二种方式
        NeedsCleanup_this nc2 = new NeedsCleanup_this();
        NeedsCleanup_this nc3 = new NeedsCleanup_this();

        try {

        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        // 第三种方式
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();

            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();

                try {
                    //...
                } finally {
                    nc5.dispose();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                nc4.dispose();
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }

}



