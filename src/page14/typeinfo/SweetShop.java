package page14.typeinfo;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try{
            Class.forName("page14.typeinfo.Gum");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
        // static{} 只有在第一次被加载到内存中才会执行
        new Cookie();
    }
}

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}


