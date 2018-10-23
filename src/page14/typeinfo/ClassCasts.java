package page14.typeinfo;

class Building {};
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        System.out.println(b);
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        System.out.println(h);
        h = (House) b;
        System.out.println(h);

        Building b2 = new Building();
        b2 = (Building) h;
        System.out.println(b2);

    }


}
