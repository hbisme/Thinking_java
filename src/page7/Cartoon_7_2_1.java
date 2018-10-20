package page7;

class Art {
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}

public class Cartoon_7_2_1 extends Drawing {
//    即使子类没有构造函数，也会默认调用执行父类的构造函数
//    public Cartoon_7_2_1(){
//        System.out.println("Cartoon constructor");
//    }

    public static void main(String[] args) {
        Cartoon_7_2_1 x = new Cartoon_7_2_1();
    }
}
