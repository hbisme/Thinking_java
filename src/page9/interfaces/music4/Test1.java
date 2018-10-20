package page9.interfaces.music4;

abstract class Book{
    public abstract void print();
}
class MyBook extends Book{
    int n = 10;
    @Override
    public void print() {
        System.out.println(n);
    }
    public MyBook(){
        print();
    }
}

abstract class Apple{
}

class MyApple extends Apple{
    public void print(){
        System.out.println("this is My Apple ");
    }

    static MyApple say(Apple apple){
        return (MyApple)apple;
    }



}

public class Test1 {
    public static void main(String[] args) {
//        Book    book = new Book() ;
        MyBook myBook = new MyBook();
        myBook.print();
    }
}
