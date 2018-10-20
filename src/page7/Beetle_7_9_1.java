package page7;
// 类加载顺序
class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = "+i+", j= "+j);
        j = 39;
    }
    private static int x1 = printlInit("Static Insect.x1.initialized");
    static int printlInit(String s){
        System.out.println(s);
        return 47;
    }

}

public class Beetle_7_9_1 extends Insect {
    private int k = printlInit("Beetle.k initialized");
    public Beetle_7_9_1(){
        System.out.println("k = "+k);
        System.out.println("j = "+j);
    }
    private static int x2 = printlInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Beetle costructor");
        Beetle_7_9_1 b = new Beetle_7_9_1();
    }

}
