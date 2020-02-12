package page12.exceptions.test;

public class Test3 {
    public static void main(String[] args) {
        String[] arr = new String[3];

        try {
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
