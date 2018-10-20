package page9.interfaces;

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}

class ActionCharacter {
    public void fight() {
        System.out.println("actionCharacter fight");
    }

    public void climb(){
        System.out.println("climb in actionCharacter");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim(){
        System.out.println("hero is swimming");
    }

    public void fly(){
        System.out.println("hero is flying");
    }


}

public class Adventure {
    public static void t(CanFly x){x.fly();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFight x){x.fight();}
    public static void w(ActionCharacter X){ X.fight();}
    public static void c(CanClimb X){ X.climb();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        c(h);
    }

}
