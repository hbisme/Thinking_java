package page14.typeinfo.page14.test.test21;


interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("do something!");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("do something else: " + arg);
    }
}

class SimpleProxy implements Interface {
    public static Integer cnt = 0;

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        cnt ++;
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        cnt ++;
        System.out.println("SimpleProxy somethingElse");
        proxied.somethingElse(arg);
    }

}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {

        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));

        System.out.println(SimpleProxy.cnt);

    }
}
