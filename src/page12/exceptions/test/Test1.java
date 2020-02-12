package page12.exceptions.test;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println("in main");
            throw new Exception("exception in main ");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("in finally");
        }
    }
}
