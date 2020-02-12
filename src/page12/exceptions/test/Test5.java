package page12.exceptions.test;

import java.util.Random;

public class Test5 {

    public static void main(String[] args) {

        Exception exception = null;

        while (1 ==1) {
            try {
                Integer random = new Random().nextInt();
                System.out.println(random);
                if(random < 10) {
                    throw new Exception();
                }
                break;




            } catch (Exception e) {
                System.out.println("in exception");
                exception = e;
            }

        }
        System.out.println("end");

    }
}
