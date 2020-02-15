package page15.generics;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeWildcards {
    static void WriteTo(List<? super Apple> list) {
        list.add(new Apple());
        list.add(new Jonathan());
        // list.add(new Fruit());
    }
    public static void main(String[] args) {
        List<Apple> alist = new ArrayList<Apple>();
        WriteTo(alist);

        List<Fruit> flist = new ArrayList<Fruit>();
        WriteTo(flist);

        List<Jonathan> jlist = new ArrayList<Jonathan>();
        // WriteTo(jlist);



    }
}
