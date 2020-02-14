package page15.generics;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

import page15.generics.coffee.Coffee;
import page15.generics.coffee.CoffeeGenerator;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }

        Collection<Integer> funumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (Integer i : funumbers) {
            System.out.print(i + " ");
        }

    }
}
