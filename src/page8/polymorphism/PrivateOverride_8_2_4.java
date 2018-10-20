package page8.polymorphism;
class Dervied extends PrivateOverride_8_2_4{
    public void f(){
        System.out.println("public f()");

    }
}

public class PrivateOverride_8_2_4 {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride_8_2_4 po = new Dervied();
        po.f();
    }

}
