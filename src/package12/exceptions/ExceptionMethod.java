package package12.exceptions;

public class ExceptionMethod {
    public static void main(String[] args) throws InterruptedException {
        try{
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("cacche Exception");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("to String(): " + e.toString());
            System.out.println("printStackTrace(): " );
            Thread.sleep(100);
            e.printStackTrace();
        }
    }
}
