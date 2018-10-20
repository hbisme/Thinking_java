package page8.polymorphism;


class Actor{
    public void act(){
    }
}

class HappyActor extends Actor{
    @Override
    public void act(){
        System.out.println("HappyActory");
    }
}

class  SadActor extends Actor {
    @Override
    public void act(){
        System.out.println("SadActor");
    }
}

class Stage{
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}

public class Transmogrify_8_5 {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
