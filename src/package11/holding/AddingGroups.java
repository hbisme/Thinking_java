package package11.holding;

import java.lang.reflect.Array;
import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6,7,8,9};
        System.out.println(collection);
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);

        Collections.addAll(collection, 11,12,13);
        System.out.println(collection);
//        collection.addAll(collection, moreInts);

        List<Integer> list = Arrays.asList(16,17,18);
        list.set(0, 160);
        System.out.println(list);
        list.add(19);
        System.out.println(list);


    }

}
