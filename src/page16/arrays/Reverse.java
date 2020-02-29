package page16.arrays;

import net.mindview.util.Generated;

import java.util.Arrays;
import java.util.Collections;

import static page16.arrays.CompType.generator;

public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("排序前的结果: ");
        System.out.println(Arrays.toString(a));
        // 反转排序
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("排序后的结果: ");
        System.out.println(Arrays.toString(a));

    }
}
