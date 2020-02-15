package page15.generics;

import net.mindview.util.FourTuple;
import net.mindview.util.TwoTuple;

class Amphibian {
}

class CehCle {
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple("hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }


    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);


    }
}
