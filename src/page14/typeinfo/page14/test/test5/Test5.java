package page14.typeinfo.page14.test.test5;

import javafx.scene.transform.Rotate;

abstract  class Shape {
    void draw(){
        // 这个this表示 类的toString方法的调用
        System.out.println(this+ ".draw()");
    }

//    abstract void rotate(Shape shape);

    abstract public String toString();

}

class Circle extends Shape {
    public String toString(){
        return "Circle";
    }





}

class Square extends Shape {
    public String toString(){
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString(){
        return "Triangle";
    }
}

public class Test5 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        rotate(triangle);
        rotate(circle);
    }

    public static void rotate(Shape shape){
        Boolean same = shape.getClass().getCanonicalName().equals("page14.typeinfo.page14.test.test5.Circle");
        if(same){

        }else {
            shape.draw();
        }
    }
}
