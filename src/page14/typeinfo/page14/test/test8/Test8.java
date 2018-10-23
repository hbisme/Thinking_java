package page14.typeinfo.page14.test.test8;


import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) throws Throwable {
        String source = "java.util.LinkedList" ;
        Class<?> cl = Class.forName(source);


        while (!cl.getSuperclass().equals("null")){
            Object target = cl.getSuperclass();
            System.out.println(target);
            Field[] fields = cl.getDeclaredFields();
            System.out.println(Arrays.asList(fields));
            cl = cl.getSuperclass();


        }



    }
}
