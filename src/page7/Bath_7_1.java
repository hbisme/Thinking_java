package page7;

class Soap{
    private String s;
    Soap(int i){
        System.out.println("Soap()");
        s = "Constructed " + i;
    }
    public String toString(){return s;}
}

public class Bath_7_1 {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille = new Soap(1);  // 定义 实例变量时候设置对象,在构造函数之前执行
    private int i;
    private float toy;
    public Bath_7_1(){
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap(2);  // 在类的构造函数中初始化对象
    }
    {i = 47;}   // 第三种方式 初始化
    public String toString(){
        if(s4 == null){
            s4 = "s4_joy";  // 第四种方式 初始化
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille
                ;
    }

    public static void main(String[] args) {
        Bath_7_1 b = new Bath_7_1();
        System.out.println(b);
    }

}
