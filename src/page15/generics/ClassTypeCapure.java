package page15.generics;

class Building{}
class House extends Building{}

public class ClassTypeCapure<T> {
    private Class<T> kind;

    public ClassTypeCapure(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }


    public static void main(String[] args) {
        ClassTypeCapure<Building> ctt1 = new ClassTypeCapure<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ClassTypeCapure<House> ctt2 = new ClassTypeCapure<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
    }
}
