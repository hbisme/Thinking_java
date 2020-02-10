package page15.generics.test;

class CasA{
    public int id;
    public int age;
    public String name;

    public CasA(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class Holder<T> {
    private T t;

    public Holder(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        CasA cas1 = new CasA(1, 10, "name1");
        CasA cas2 = new CasA(2, 20, "name2");
        CasA cas3 = new CasA(3, 30, "name3");
        Holder<CasA> t1 = new Holder<CasA>(cas1);
        Holder<CasA> t2 = new Holder<CasA>(cas2);
        Holder<CasA> t3 = new Holder<CasA>(cas3);
        System.out.println(t1.getT().getName());
    }
}
