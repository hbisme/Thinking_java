package page7;

class Villain{
    protected int id;
    String key;
    private String name;
    protected void set(String name){
        this.name = name;
    }
    public Villain(String name){
        this.name = name;
    }
    public String toString(){
        return " I m a Vilain and my name is " + this.name;
    }
}
class Other{
    public Villain villain = new Villain("haha");
    public int id;
    public void  test(){
        villain.set("hb2");
        System.out.println(villain.toString());
    }
}
public class Orc_7_6  extends Villain{
    private int orcNumber;
    public Orc_7_6(String name, int orcNumber){
        super(name);
        this.id =2;
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        super.set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc " + orcNumber + super.toString();
    }
    public void test(){
        Villain villain = new Villain("haha");
        villain.set("haha2");
        System.out.println(villain);
    }

    public static void main(String[] args) {
        Orc_7_6 orc = new Orc_7_6("hb",19);
        System.out.println(orc);
        orc.change("fsl",18);
        System.out.println(orc);
        orc.test();
    }
}
