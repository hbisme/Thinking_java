package page15.generics;

class GenericBase<T> {
    private T element;

    public void set(T arg) {
        element = arg;
    }

    public T getElement() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2 extends GenericBase {
}

public class ErasureAndInheritance {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.getElement();
        d2.set(obj);
        System.out.println(obj);
    }
}
