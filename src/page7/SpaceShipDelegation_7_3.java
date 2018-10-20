package page7;
// 代理类
public class SpaceShipDelegation_7_3 {
    private String name;
    private SpaceShipControls_7_3 controls = new SpaceShipControls_7_3();
    public SpaceShipDelegation_7_3(String name){
        this.name = name;
    }
    public void back(int velocity){controls.back(velocity);}
    public void down(int velocity){controls.down(velocity);}
    public void forward(int velocity){controls.forward(velocity);}
    public void left(int velocity){controls.left(velocity);}
    public void right(int velocity){controls.right(velocity);}
    public void turboBoost(int velocity){controls.turboBoost();}
    public void up(int velocity){controls.up(velocity);}

    public static void main(String[] args) {
        SpaceShipDelegation_7_3 protector = new SpaceShipDelegation_7_3("Nsea Protector");
        protector.forward(100);
    }



}
