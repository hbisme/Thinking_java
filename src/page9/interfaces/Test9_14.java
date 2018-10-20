package page9.interfaces;

interface Fa {
    void fa1();
    void fa2();

}

interface Fb {
    void fb1();
    void fb2();

}

interface Fc {
    void fc1();
    void fc2();

}

interface FF extends Fa, Fb, Fc {
    void ff();
}

class Person{
    String name = "person";

}



class A extends Person implements FF {
    @Override
    public void fa1() {

    }

    @Override
    public void fa2() {

    }

    @Override
    public void fb1() {

    }

    @Override
    public void fb2() {

    }

    @Override
    public void fc1() {

    }

    @Override
    public void fc2() {

    }

    @Override
    public void ff() {

    }

}

public class Test9_14 {

    static void w(Fa fa){ }
    static void s(Fb fb){ }
    static void a(Fc fc){ }
    static void d(Fc fc){ }
    static void e(FF ff){ }

    public static void main(String[] args) {
//        page9.interfaces.nesting.A a = new page9.interfaces.nesting.A();
//        w(a);
//        s(a);
//        a(a);
//        d(a);
//        e(a);


    }
}
