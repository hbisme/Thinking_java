package page16.arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.util.Arrays;
import java.util.Random;

public class CompType implements Comparable<CompType> {
    int i;
    int j;

    private static int count = 1;

    public CompType(int n1, int n2) {
        this.i = n1;
        this.j = n2;
    }

    @Override
    public String toString() {
        String result = "[i=" + i + " ,j=" + j + "]";
        return result;
    }

    @Override
    public int compareTo(CompType o) {
        if (i < o.i) {
            return -1;
        } else if (i > o.i) {
            return 1;
        } else {
            return 0;
        }
    }

    private static Random r = new Random(47);

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("排序前的结果: ");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后的结果: ");
        System.out.println(Arrays.toString(a));
    }

}
