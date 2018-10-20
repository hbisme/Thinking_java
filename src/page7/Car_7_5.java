package page7;

class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
    String service(){
        return "engine is service";
    }
}

class Wheel{
    public void inflate(int ps){}
}

class Window{
    public void rollup(){ };
    public void rolldonw(){};
}

class Door{
    public Window window = new Window();
    public void open(){ }
    public void close(){}
}
public class Car_7_5 {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();
    public Car_7_5(){
        for(int i = 0 ;i< 4; i++){
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car_7_5 car = new Car_7_5();
        car.left.window.rolldonw();
        car.wheel[0].inflate(1);
        System.out.println(car.engine.service());
    }

}
