package page15.generics;

public class SimpleHolder {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.setObj("Item");
        System.out.println((String) simpleHolder.getObj());
    }
}
