package page8.polymorphism.shape;

public class CirCle extends Shape {
    @Override
    public void draw() {
        System.out.println("circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("circle.erase");
    }

    @Override
    public void display() {
        System.out.println("circle display");
    }
}

