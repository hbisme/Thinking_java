package page14.typeinfo.page14.test;

import java.lang.reflect.Constructor;

class ToyTest{
    String name;
    Integer age;
    public ToyTest(){

    }

    public ToyTest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class Test19 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("page14.typeinfo.page14.test.ToyTest");
        System.out.println(c);
        Constructor<?> c1 = c.getDeclaredConstructor();
        ToyTest o1 = (ToyTest)c1.newInstance();
        o1.setName("hb");
        System.out.println(o1.name);

    }

}
