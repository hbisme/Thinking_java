package page11.test;



public class Test15 {
    public static void main(String[] args) {
        Double start = 380000D;
        Double sum = 380000D;
        for (int i = 2; i <= 15; i++) {
             start = start*1.08;
            sum += start;
            System.out.println(start);
        }
        System.out.println(sum);
    }
}
