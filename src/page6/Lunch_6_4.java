package page6;

class Soup1{
    private Soup1(){
    }
public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2{
    private Soup2(){
    }
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}
public class Lunch_6_4 {
    void testPrivate(){
//        Soup1 soup = new Soup1();  // 构造器为私有的，所以不能这样实例化对象
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
        System.out.println(soup);
    }
    void testSingleton(){
        System.out.println(Soup2.access());
    }

    public static void main(String[] args) {
        Lunch_6_4 l = new Lunch_6_4();
        l.testStatic();
        l.testStatic();
        l.testSingleton();
        l.testSingleton();
    }
}
