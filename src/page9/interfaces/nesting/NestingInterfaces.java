package page9.interfaces.nesting;

public class NestingInterfaces {

    public class Bimp implements A.B {
        public void f(){}
    }

    class Cimp implements A.C{

        public void f() {
        }
    }

    // 不能实现内部的私有接口
//    class Dimp implements A.D {
//        public void f() {
//        }
//    }


    class Eimp implements E{
        public void g(){}
    }

    class EGimp implements E.G{
        public void f(){}
    }

    class EImp2 implements E{
        public void g(){}
        class EG implements E.G{
            public void f(){}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        // 不能访问A.D
//        A.D  ad = a.getD();

//        A.Dimp2 di2 = a.getD();

        A a2 = new A();
        a2.receiveD(a.getD());


    }

}


class A {
    interface B {
        void f();
    }

    public class Bimp implements B {
        public void f() {}
    }

    private class Bimp2 implements B {
        public void f() {}
    }

    public interface C {
        void f();
    }

    class Cimp implements C{
        public void f(){}
    }

    private class Cimp2 implements C {
        public void f(){}
    }

    private interface D {
        void f();
    }

    private class Dimp implements D{
        public void f(){}
    }

    public class Dimp2 implements D {
        public void f(){}
    }

    public D getD(){
        return new Dimp2();
    }

    private D dRef;

    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}

interface E{
    interface G{
        void f();
    }

    public interface H{
        void f();
    }

    void g();

//    private interface I{}

}






