package package12.exceptions.test;

class T1 {
    public void f() {
    };
}

public class Test2 {
    public static void main(String[] args) {
        T1 t1 = null;

        try {
            t1.f();
        }catch (Exception e){
            System.out.println("cached exception");
        }

    }
}
