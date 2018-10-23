package page14.typeinfo.page14.test;

import page14.typeinfo.Shapes;

abstract  class Shape {
    void draw(){
        // 这个this表示 类的toString方法的调用
        System.out.println(this+ ".draw()");
    }

    abstract public String toString();

}

class Rhomboid extends Shape{
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

class Circle extends Shape {
    public String toString(){
        return "Circle";
    }
}



public class Test3 {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Shape Shape = (Shape)rhomboid;
        System.out.println(Shape);

        Object a;
        if(Shape instanceof Circle ) {
            System.out.println("in Circle");
            a = ((Circle) Shape);
        }
        else {
            a = null;
        }
//        Circle circle = (Circle) Shape;


    }
}
