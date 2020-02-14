package page15.generics;

import java.util.List;
import java.util.Map;

import page14.typeinfo.Person;
import page14.typeinfo.Pet;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>> map());
    }
}
