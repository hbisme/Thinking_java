package page13.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I deel happy!";
        StringTokenizer stoke = new StringTokenizer(input);

        while(stoke.hasMoreTokens()) {
            System.out.print(stoke.nextToken() + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(input.split(" ")));
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }

    }
}
