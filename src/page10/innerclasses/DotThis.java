package page10.innerclasses;

public class DotThis {
    void f() {
        System.out.println("DontThis.f()");
    }

    public class Inner {
        public DotThis outer(){
            // 内部类对外部的引用用 ".this"
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }


}
