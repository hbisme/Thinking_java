package page8.polymorphism;

class Rodent{
    void eat(){
        System.out.println("Rodent eat");
    }
        }
class Mouse extends Rodent{
    @Override
    void eat() {
        System.out.println("Mouse eating");
    }
}
class Gerbil extends Rodent{
    @Override
    void eat() {
        System.out.println("Gerbil eating");
    }
}
class Hamster extends Rodent{

}

public class Test9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Rodent(),
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };
        for(Rodent r:rodents){
            r.eat();
        }
    }
}
