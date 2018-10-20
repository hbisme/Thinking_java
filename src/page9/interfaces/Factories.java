package page9.interfaces;

public class Factories {

    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implemention1Factory());
        serviceConsumer(new Implemention2Factory());
    }


}

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{

    Implementation1(){};
    public void method1(){
        System.out.println("Implemention1 method1 ");
    }

    @Override
    public void method2() {
        System.out.println("Implemention1 method2 ");
    }

}

class Implentation2 implements Service{
    Implentation2(){}
    public void method1(){
        System.out.println("Implementation2 method1");
    }
    public void method2(){
        System.out.println("Implementation2 method2");
    }
}

class Implemention1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implemention2Factory implements ServiceFactory{
    public Service getService(){
        return new Implentation2();
    }
}


