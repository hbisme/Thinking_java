package page11.holding;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "A,B,C,D".split(","));
        System.out.println(set1);

        set1.add("M");
        System.out.println(set1.contains("A"));
        System.out.println(set1.contains("F"));

        HashSet<String> set2 = new HashSet<String>();
        Collections.addAll(set2, "A,B".split(","));

        System.out.println(set1.containsAll(set2));
        set1.remove("M");
        set1.removeAll(set2);
        System.out.println(set1);
        System.out.println(set2);



    }
}
