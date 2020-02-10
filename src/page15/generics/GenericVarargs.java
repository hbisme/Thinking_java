package page15.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        ArrayList<T> result = new ArrayList<T>();
        for(T item: args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(makeList(1, 2, 3));
        System.out.println(makeList(1, 2));
    }


}
