package page7;

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString(){return s;}
}

public class SprinklerSystem_7_1 {
    private String valve1, valve2, valve3, valve4;  // 对象引用初始化为null
    private WaterSource source = new WaterSource();
    private int i;       //基本类型初始化为0
    private float f;
    @Override
    public String toString(){
        return
                "value1 = " + valve1 + " " +
                        "value2 = " + valve2 + " " +
                        "value3 = " + valve3 + " " +
                        "value4 = " + valve4 + " " +
                        "i = " + i + " " + "f = " + f +
                        " source = " + source;

    }

    public static void main(String[] args) {
        SprinklerSystem_7_1 sprinklerSystem_7_1 = new SprinklerSystem_7_1();
        System.out.println(sprinklerSystem_7_1);

    }

}
