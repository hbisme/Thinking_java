package page5;

class Book{
    String name = "Book name";
}
public class Test2 {
    Test2(){
        System.out.println("test2");
    }
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.name);
        Test2 t = new Test2();
    }
}
