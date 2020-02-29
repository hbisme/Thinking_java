package page16.arrays;

import java.util.Arrays;

public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere[] a;
        BerylliumSphere[] b = new BerylliumSphere[5];
        System.out.println(Arrays.toString(b));

        BerylliumSphere[] c = new BerylliumSphere[4];

        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }

        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};

        System.out.println("a.lenght = " + a.length);
        System.out.println("b.lenght = " + b.length);
        System.out.println("c.lenght = " + c.length);
        System.out.println("d.lenght = " + d.length);
        System.out.println();

        a = d;
        System.out.println("a.lenght = " + a.length);

        int[] e;
        int[] f = new int[5];
        System.out.println(Arrays.toString(f));
        int[] g = new int[4];

        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }

        int[] h = {11, 47, 93};
        System.out.println("f.lenght = " + f.length);
        System.out.println("g.lenght = " + g.length);
        System.out.println("h.lenght = " + h.length);

        e = h;
        System.out.println("e.lenght = " + e.length);
        e = new int[]{1, 2};
        System.out.println("e.lenght = " + e.length);




    }
}
