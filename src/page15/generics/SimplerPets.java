package page15.generics;

import java.util.List;
import java.util.Map;

import page14.typeinfo.Person;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Person>> petPeople = New.map();

    }
}
