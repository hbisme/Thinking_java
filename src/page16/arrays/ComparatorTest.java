package page16.arrays;

import net.mindview.util.Generated;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static page16.arrays.CompType.generator;

class CompTypeComparator implements Comparator<CompType> {

    @Override
    public int compare(CompType o1, CompType o2) {
        if (o1.j > o2.j) {
            return 1;
        } else if (o1.j < o2.j) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("排序前的结果: ");
        System.out.println(Arrays.toString(a));
        // 按自己的方式来排序
        Arrays.sort(a, new CompTypeComparator());
        System.out.println("排序后的结果: ");
        System.out.println(Arrays.toString(a));
    }
}
