package page15.generics;

class ClassAsFactory<T> {
    private T x;

    public ClassAsFactory(Class<T> kind) throws IllegalAccessException, InstantiationException {
        x = kind.newInstance();
    }
}

class Employee {
}

public class InstantiateGenericType {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
        System.out.println(fe);

        ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
        System.out.println(fi);



    }
}
