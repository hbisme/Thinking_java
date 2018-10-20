package page8.polymorphism.music;

class Cycle{
    String echo(){
        return "cycle";
    }
}
class Unicycle extends Cycle{
    @Override
    String echo(){
        return "unicycle";
    }
}

class Bicycle extends Cycle{
    @Override
    String echo(){
        return "bicycle";
    }
}
class Tricycle extends Cycle{
    @Override
    String echo(){
        return "tricycle";
    }
}

public class Test1 {
    static Cycle ride(Cycle cycle){
        return (Cycle)cycle;
    }
    public static void play(Cycle cycle){
        System.out.println(cycle.echo());
    }
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Cycle c3 = new Tricycle();
        Tricycle tricycle = new Tricycle();
        Cycle c1 = ride(unicycle);
        Cycle c2 = ride(bicycle);
        System.out.println(c1.getClass());
        System.out.println(c2.getClass());
        System.out.println(c3.getClass());
        play(c1);

    }
}
