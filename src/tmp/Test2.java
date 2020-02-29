package tmp;

class Root{
    public Root(String x){
        System.out.println("tmp.Root "+x);
    }
}
class Stem extends Root{
    Component1 a = new Component1("a");
    Component2 b = new Component2("b");
    Component3 c = new Component3("c");

    public Stem(String x){
        super(x);
        System.out.println("tmp.Stem "+x);
    }
}
class  Component1{
    public Component1(String x){
        System.out.println("Com1 "+x);
    }
}

class  Component2{
    public Component2(String x){
        System.out.println("Com2 "+x);
    }
}
class  Component3{
    public Component3(String x){
        System.out.println("Com3 "+x);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Stem stem  = new Stem("123");
    }
}
