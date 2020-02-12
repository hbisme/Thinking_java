package page10.innerclasses.test;


class Outerer{
    public String str = "inOuter";
    class Inner{
        Outerer out = Outerer.this;
        String inStr = out.str + "-> inner";

    }
}

public class Test5 {

    // 先实例化外部类,再用外部类.new 来实例化内部类
    Outerer out = new Outerer();
    public Outerer.Inner inner = out.new Inner();

    public void print(){
        System.out.println(inner);
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.print();
    }
}
