package page16.arrays;

import java.util.Arrays;
import java.util.Random;

public class IceCream {

    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint chip", "Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud Pie"
    };

    private static Random rand = new Random(47);

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }
        String[] results = new String[n];

        boolean[] picked = new boolean[FLAVORS.length];

        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = rand.nextInt(FLAVORS.length);
            } while (picked[i]);

            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(IceCream.flavorSet(3)));
        }

    }
}
