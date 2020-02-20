package page13.strings;

public class InfiniteRecursion {
    public String toString() {
        return "InfiniteRecursion address" + super.toString() + "\n";
    }

    public static void main(String[] args) {

        System.out.println(new InfiniteRecursion());

    }
}
