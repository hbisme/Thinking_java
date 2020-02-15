package page15.generics;

public class Manipulator2<T extends Hasf> {
    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }

    public static void main(String[] args) {
        Hasf hf = new Hasf();
        Manipulator2<Hasf> m = new Manipulator2<>(hf);
        m.manipulate();
    }
}
