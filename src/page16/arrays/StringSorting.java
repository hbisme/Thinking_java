package page16.arrays;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;

public class StringSorting {

    public static void main(String[] args) {

        String [] sa = Generated.array(new String[20], new RandomGenerator.String(5));

        System.out.println("排序前的结果: ");
        System.out.println(Arrays.toString(sa));
        Arrays.sort(sa);
        System.out.println("默认排序后的结果: ");
        System.out.println(Arrays.toString(sa));

        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println("倒序排序后的结果: ");
        System.out.println(Arrays.toString(sa));

        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println("忽略大小写排序后的结果: ");
        System.out.println(Arrays.toString(sa));






    }


}
