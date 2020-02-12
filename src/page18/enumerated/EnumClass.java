package page18.enumerated;

enum Shrubbery {
    GROPND, CRAWLING, HANDING
}

public class EnumClass {


    public static void main(String[] args) {
        // Shrubbery t = Shrubbery.values()[0];

        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println("compareTo: " +s.compareTo(Shrubbery.CRAWLING));
            System.out.println("equals: "+s.equals(Shrubbery.CRAWLING));
            System.out.println("==: "+ (s == Shrubbery.CRAWLING));
            System.out.println(s.getDeclaringClass());
            System.out.println("name: "+s.name());
            System.out.println("---------");
        }

        for(String s: "GROPND,CRAWLING,HANDING".split(",")) {
            // Shrubbery shrub = Shrubbery.valueOf(s);
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrub);
        }

    }

}
