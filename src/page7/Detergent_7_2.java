package page7;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a){
        s +=a;
    }
    public void dilute() {
        append("dilute()");
    }
    public void apply(){
        append("apply()");
    }
    public void scrub(){
        append("scrub()");
    }
    public String toString(){
        return s;
    }

    public static   void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);


//        Detergent_7_2 y = new Detergent_7_2();
//        y.dilute();
//        y.apply();
//        y.scrub();
//        y.foam();
//        System.out.println(y);
    }
}

public class Detergent_7_2 extends Cleanser {
    public static void main(String[] args) {
//        Cleanser x = new Cleanser();
//        x.dilute();
//        x.apply();
//        x.scrub();
//        System.out.println(x);


        Detergent_7_2 y = new Detergent_7_2();
        y.dilute();
        y.apply();
        y.scrub();
        y.foam();
        System.out.println(y);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam(){
        append(" foam() ");
    }

}

class Detergent extends  Detergent_7_2 {
    @Override
    public void scrub(){
        append("Detergent");
    }

    public void sterilize(){
        append("sterilize");
    }

    public static void main(String[] args) {
        Detergent z = new Detergent();
        z.scrub();
        z.sterilize();
        System.out.println(z);
    }
}
