package page15.generics;


import java.util.List;
import java.util.Map;

import page14.typeinfo.Person;
import page14.typeinfo.Pet;

public class LimitsofInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.map());
    }
}
