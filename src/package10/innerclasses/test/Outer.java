package package10.innerclasses.test;

public class Outer {

    class Inner{
        int i = 10;
    }

    Inner in(){
       return new Inner();
    }

    public static void main(String[] args) {
        Inner a = (new Outer()).in();
        System.out.println(a.i);
    }

}
