package page7;

class Gizmo{
    public void spin(){

    }
}
public class FinalArguments_7_8 {
    void with(final Gizmo g){
//        g = new Gizmo();  //不能改变方法参数为final 的对象
    }
    void withOut(Gizmo g){
        g =new Gizmo();
        g.spin();
    }
    void f(final int i){
//        i=i+1       //
    }

    public static void main(String[] args) {
        FinalArguments_7_8 bf = new FinalArguments_7_8();
        bf.withOut(null);
        bf.with(null);
    }
}
