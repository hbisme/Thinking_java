package page13.strings;

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-123".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+991".matches("-?\\d+"));
        System.out.println("+991".matches("(-\\+)?\\d+"));
    }
}
