package page15.generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storae = new ArrayList<T>();
    private Random random = new Random(47);

    public void add(T item) {
        storae.add(item);
    }

    public T select() {
        return storae.get(random.nextInt(storae.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; i ++) {
            System.out.println(rs.select() + " ");
        }

        RandomList<Integer> rs2 = new RandomList<Integer>();
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        for(Integer i : arr ) {
            rs2.add(i);
        }
        System.out.println(rs2.select());
        System.out.println(rs2.select());


    }
}
