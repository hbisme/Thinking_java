package page8.polymorphism;

class Useful{
    public void f(){}
    public void g(){}
}
class MoreUserFUl extends Useful{
    public void f(){}
    public void g(){}
    public void u(){}
    public void v(){}
    public void w(){}
}

public class RTTI_8_5 {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUserFUl()
        };
        x[0].f();
        x[1].g();

        ((MoreUserFUl)x[1]).u();
           ((MoreUserFUl)x[0]).u();
    }
}
