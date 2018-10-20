package page7;

public class SpaceShipControls_7_3 {
    void up(int velocity){
    }
    void down(int velocity){
    }
    void left(int velocity){
    }
    void right(int velocity){
    }
    void forward(int velocity){
    }
    void back(int velocity){
    }
    void turboBoost(){
    }
}

class SpaceShip extends SpaceShipControls_7_3 {
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(1000);
    }
}
