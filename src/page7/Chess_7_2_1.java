package page7;

public class Chess_7_2_1 extends BoardGame {
    Chess_7_2_1(){
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess_7_2_1 x = new Chess_7_2_1();
    }
}

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
//        System.out.println(123);
        super(i);
        System.out.println("BoardGame constructor");
    }
}

