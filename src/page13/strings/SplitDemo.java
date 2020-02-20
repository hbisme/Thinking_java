package page13.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {

        String input = "This!!unusual use!!of exclammation!!points";

        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));

        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));



    }
}
