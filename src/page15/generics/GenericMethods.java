package page15.generics;

public class GenericMethods {
    public <T> void f(T t) {
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(gm);
        gm.f(1);
        gm.f(1.1);
    }

}
