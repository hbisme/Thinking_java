package package11.holding;

import java.util.*;
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(30);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < 1000 ; i++) {
            treeSet.add(random.nextInt(30));
        }
        System.out.println(treeSet);
    }
}
