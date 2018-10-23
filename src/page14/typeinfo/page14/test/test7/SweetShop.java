package page14.typeinfo.page14.test.test7;

public class SweetShop  {
    public static void main(String[] args) throws Throwable {

        String thing = "page14.typeinfo.page14.test.test7.Candy";

        Class<?> cl = Class.forName(thing);

        Object obj = cl.newInstance();
        System.out.println(obj);



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


