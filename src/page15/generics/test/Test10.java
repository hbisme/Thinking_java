package page15.generics.test;

public class Test10 {
    public <T, I, O> void f(T t, I i, O o, String s) {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(i.getClass().getSimpleName());
        System.out.println(o.getClass().getSimpleName());
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test10 gm = new Test10();
        gm.f("", 1, 1.2, "helo");
    }
}
