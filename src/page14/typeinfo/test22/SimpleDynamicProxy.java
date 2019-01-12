package page14.typeinfo.test22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// import page14.typeinfo.Interface;
// import page14.typeinfo.RealObject;
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



class DynamicProxyHandler implements InvocationHandler {
    public static Integer cnt = 0;

    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if(args != null) {
            for(Object arg: args) {
                System.out.println(" " + arg);
            }
        }
        cnt++;
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface ifce) {
        ifce.doSomething();
        ifce.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        System.out.println("--------------");
        // Insert a proxy and call again
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));

        consumer(proxy);
        System.out.println(DynamicProxyHandler.cnt);


    }

}
