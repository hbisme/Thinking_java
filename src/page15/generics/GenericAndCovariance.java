package page15.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // flist.add(new Apple());
        flist.get(0);
    }
}
