package tmp;

public class Test {
    public static void main(String[] args) {
        C c = new C("123");
        c.echo();  // 这行第四执行
    }
}

class A{
    public A(String a){
        System.out.println("tmp.A"+a);
    }
}

class B{
    public B(String b){
        System.out.println("tmp.B"+b);
    }
}

class C extends A{
    B b = new B("bb");   //这行第二执行
    public void echo(){
        System.out.println("c");
    }

    public C(String c){
        super(c);            //这行最先执行
        System.out.println("ccc");  //这行第三执行
    }
}

//    输出结果：
//    A123
//    Bbb
//    ccc
//    c
