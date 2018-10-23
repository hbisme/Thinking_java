package page14.typeinfo;

public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        System.out.println(intClass);
        intClass = double.class;
        System.out.println(intClass);
    }
}
