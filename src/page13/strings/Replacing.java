package page13.strings;

public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "Located"));
        System.out.println(s.replaceAll("you|have", "Located"));



    }

}
