package page14.typeinfo;

import java.lang.reflect.Method;

import page14.typeinfo.interfacea.A;
import page14.typeinfo.packageaccess.HiddenC;
import page14.typeinfo.packageaccess.*;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // if(a instanceof C){
        //     C c = (C)a;
        // }

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");


    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }

}
