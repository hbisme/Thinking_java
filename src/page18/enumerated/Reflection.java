package page18.enumerated;


import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore {HERE, THERE}


public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("--------Analzing " + enumClass + " " + "--------");
        System.out.println("Interfaces: " );
        for (Type t : enumClass.getGenericInterfaces()) {
            System.out.print(t);
        }
        System.out.println( );
        System.out.println("Base: " + enumClass.getGenericSuperclass());
        System.out.println("Methods: ");

        Set<String> methods = new TreeSet<String>();

        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }

        System.out.println(methods);
        return methods;


    }


    public static void main(String[] args) {

        Set<String> ExploreMethods =analyze(Explore.class);

        Set<String> enumMethods =analyze(Enum.class);

        System.out.println(ExploreMethods.containsAll(enumMethods));


    }
}
