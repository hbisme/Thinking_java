package page7;

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}

class OverrideingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    };
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverrideingPrivate{

    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion_7_8_2 {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverrideingPrivate op = op2;
//        op.f();
//        op.g();
        WithFinals wf = op2;

    }
}
