package page8.polymorphism;
import page8.polymorphism.shape.*;
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[15];
        for(int i = 0; i< s.length; i++){
            s[i] = gen.next();
        }
        for(Shape shape:s){
            shape.draw();
        }

    }
}
