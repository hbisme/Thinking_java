package page11.holding;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> intset = new HashSet<Integer>();
        for(int i =0; i< 1000; i++){
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);

    }

}
