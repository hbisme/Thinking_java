package package12.exceptions;

class ThreeException extends Exception{}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while(true) {
            try{
                if(count ++ == 0 ){
                    System.out.println("count in while: " + count );
                    throw new ThreeException();
                }
                System.out.println("no exception");
            }catch (ThreeException e) {
                System.out.println("ThreeException");
            }finally {
                System.out.println("in finally");
                if(count == 2) {
                    break;
                }
            }
        }
    }


}
