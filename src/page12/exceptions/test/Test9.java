package page12.exceptions.test;

import java.util.Random;

class Exception1 extends Exception{}
class Exception2 extends Exception{}
class Exception3 extends Exception{}

public class Test9 {

    static void f() throws Exception1, Exception2, Exception3 {
        Integer i = new Random().nextInt();

        if(i > 1)
            throw new Exception1();
        if(i > 2000)
            throw new Exception2();
        if(i<1)
            throw new Exception3();
    }

    public static void main(String[] args) {
        try {
            Test9.f();
        }catch (Exception e){
            // e.printStackTrace();
            StackTraceElement[] trace = e.getStackTrace();
            System.out.println(trace[0]);
            System.out.println(trace[1]);
        }



    }
}
