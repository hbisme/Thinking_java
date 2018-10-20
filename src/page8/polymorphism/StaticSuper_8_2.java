package page8.polymorphism;

class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}
class StaticSub extends StaticSuper{

    public static String staticGet(){
        return "Derived staticGet()";
    }
    @Override
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}

public class StaticSuper_8_2 {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();

        System.out.println(sup.dynamicGet());
    }
}
