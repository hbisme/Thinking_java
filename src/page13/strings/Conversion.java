package page13.strings;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        char u = 'a';
        System.out.println("u='a'");

        f.format("s: %s\n", u);
        f.format("c: %c\n", u);
        f.format("b: %b\n", u);
        f.format("h: %h\n", u);
        System.out.println("------------");

        int v = 121;
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
        f.format("s: %s\n", v);
        f.format("x: %x\n", v);
        f.format("h: %h\n", v);
        System.out.println("------------");

        BigInteger w = new BigInteger("50000000000000");
        f.format("d: %d\n", w);
        f.format("b: %b\n", w);
        f.format("s: %s\n", w);
        f.format("x: %x\n", w);
        f.format("h: %h\n", w);
        System.out.println("------------");

        double x = 179.543;
        f.format("b: %b\n", x);
        f.format("s: %s\n", x);
        f.format("f: %f\n", x);
        f.format("e: %e\n", x);
        System.out.println("------------");

        Conversion y = new Conversion();
        f.format("b: %b\n", y);
        f.format("s: %s\n", y);
        f.format("h: %h\n", y);
        System.out.println("------------");

        boolean z = false;
        f.format("b: %b\n", z);
        f.format("s: %s\n", z);
        f.format("h: %h\n", z);



    }
}
