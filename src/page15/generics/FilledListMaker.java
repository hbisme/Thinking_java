package page15.generics;

import java.util.ArrayList;
import java.util.List;

public class FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {

        FilledListMaker filledListMaker = new FilledListMaker();
        System.out.println(filledListMaker.create("hello", 4));

    }
}
