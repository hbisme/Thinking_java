package page8.polymorphism;

class Grain{
    public String toString(){
        return "Grain";
    }
}
    class Wheat extends Grain{
        public String toString(){
            return "Wheat";
        }
    }
    class Mill {
        Grain process(){
            return new Grain();
        }
    }
    class wheatMill extends Mill {
        Wheat process(){
            return new Wheat();
        }
    }


public class CovariantReturn_8_4  {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = new Grain();
        System.out.println(g);
        m = new wheatMill();
        g = m.process();
        System.out.println(g);
    }
}
