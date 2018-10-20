package page7;

class Poppet{
    private int i;
    Poppet(int i){
        this.i =i;
    }
}
public class BlankFinal_7_8 {
    private final int i =0;
    private final int j;  // 需要在构造器里完成对final 空白变量的赋值
    private final Poppet p ;
    public BlankFinal_7_8(){
        j =1;
        p = new Poppet(2);
//        j=0; //final 的成员变量被赋值后就不能再改变
    }
    public BlankFinal_7_8(int x){
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        BlankFinal_7_8 b1 = new BlankFinal_7_8();
        BlankFinal_7_8 b2 = new BlankFinal_7_8(47);
        System.out.println(b1.j);
    }
}
