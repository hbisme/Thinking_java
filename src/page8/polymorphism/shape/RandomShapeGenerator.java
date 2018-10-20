package page8.polymorphism.shape;

import java.util.*;
public class RandomShapeGenerator {
    private Random rand = new Random(471);
    public Shape next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new CirCle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Oval();
        }
    }
}

