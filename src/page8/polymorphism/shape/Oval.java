package page8.polymorphism.shape;

public class Oval extends Shape {
    @Override
    public void draw() {
        System.out.println("oval.draw");
    }

    @Override
    public void erase() {
        System.out.println("oval.erase");
    }

    @Override
    public void display() {
        System.out.println("oval.display");
    }
}
