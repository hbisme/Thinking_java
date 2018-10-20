package page8.polymorphism;

class Base{
   void fun1(){
       System.out.println("fun1");
   }
   void fun2(){
       fun1();
       System.out.println("fun2");
   }
}
public class Test10 extends Base {
    @Override
    void fun2(){
        System.out.println("main");
    }
    public static void main(String[] args) {
        Base t = new Test10();
        t.fun2();
        t.fun1();

    }
}
