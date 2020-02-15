package page15.generics;

public class ReturnGenericType <T extends Hasf> {
    private T obj;

    public ReturnGenericType(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

}
