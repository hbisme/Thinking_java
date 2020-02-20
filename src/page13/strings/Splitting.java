package page13.strings;

import java.util.Arrays;

public class Splitting {
    public static String knights ="Then you have found ";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");

    }

}
