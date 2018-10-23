package page14.typeinfo.page14.test.test6;

import java.util.Arrays;
import java.util.List;

abstract  class Shape {
    Boolean flag;
    void draw(){
        // 这个this表示 类的toString方法的调用
        System.out.println(this+ ".draw()");
    }

    void mark(){
        flag = true;
    }
//    abstract void rotate(Shape shape);

    abstract public String toString();

}

class Circle extends Shape {
    public String toString(){
        return "Circle " + flag;
    }

}

class Square extends Shape {
    public String toString(){
        return "Square " + flag;
    }
}

class Triangle extends Shape {
    public String toString(){
        return "Triangle " + flag;
    }
}

public class Test6 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
//        System.out.println(circle1);

        List<Shape> shapes = Arrays.asList(
                new Circle(),
                new Circle(),
                new Triangle()
        );

        for(Shape shape: shapes){
            if(shape.getClass().getSimpleName().equals("Circle")){

                shape.mark();
            }

            System.out.println(shape);
        }




    }

}
