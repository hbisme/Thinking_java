package page14.typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage = "usage:\n" +
            "showMethods qualified.class.name \n" +
            "To show all methos in class or:\n" +
            "showMethods qualified.class.name word\n" +
            "To search for methods involving word";
    private static Pattern p = Pattern.compile("\\w+\\.");

    private ShowMethods(){

    }

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println(usage);
            System.exit(-1);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] ctors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                System.out.println("-----");

                for (Constructor constructor : ctors) {
                    System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                }
                System.out.println("========");

                lines = methods.length + ctors.length;
            }else {
                for(Method method: methods){
                    if(method.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;



                    }
                }
                for(Constructor constructor: ctors){
                    if(constructor.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;

                    }
                }
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
