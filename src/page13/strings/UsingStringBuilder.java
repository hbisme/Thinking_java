package page13.strings;

import java.util.Random;

public class UsingStringBuilder {
    public static Random rand = new Random(47);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length() - 1);
        result.append("]");
        return result.toString();
    }


    public static void main(String[] args) {

        System.out.println(new UsingStringBuilder());

    }


}
