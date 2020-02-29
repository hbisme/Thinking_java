package page16.arrays;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArray {


    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));

        int[][][] a2 = new int[2][2][4];
        System.out.println("a2: " + Arrays.deepToString(a2));

        Random rand = new Random(47);
        int[][][] a3 = new int[rand.nextInt(7)][][];

        for (int i = 0; i < a3.length; i++) {
            a3[i] = new int[rand.nextInt(5)][];

            for (int j = 0; j < a3[i].length; j++) {
                a3[i][j] = new int[rand.nextInt(5)];
            }
        }
        System.out.println("a3: " + Arrays.deepToString(a3));
        BerylliumSphere2[][] sphere2s = {
                {new BerylliumSphere2(), new BerylliumSphere2()},
                {new BerylliumSphere2(), new BerylliumSphere2(), new BerylliumSphere2(), new BerylliumSphere2()},
                {new BerylliumSphere2(), new BerylliumSphere2(), new BerylliumSphere2(), new BerylliumSphere2(), new BerylliumSphere2()}
        };

        System.out.println("sp: " + Arrays.deepToString(sphere2s));

        Integer[][] a4 = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        };

        System.out.println("a4: " + Arrays.deepToString(a4));

        Integer[][] a5;
        a5 = new Integer[3][];

        for (int i = 0; i < a5.length; i++) {
            a5[i] = new Integer[3];
            for (int j = 0; j < a5[i].length; j++) {
                a[i][j] = i * j;
            }
        }
        System.out.println("a5: " + Arrays.deepToString(a5));


    }

}

