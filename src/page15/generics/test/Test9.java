package page15.generics.test;

public class Test9 {
    public <T, I, O> void f(T t, I i, O o) {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(i.getClass().getSimpleName());
        System.out.println(o.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Test9 gm = new Test9();
        gm.f("", 1, 1.2);



    }
}
