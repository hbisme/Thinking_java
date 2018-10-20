package page7;

class Forg{
    protected int id =1;
    protected String name = "forg";
    protected void echo(){
        System.out.println(id+" "+name);
    }
}

class Amphibian extends Forg{
    int id;
    Amphibian(){
        this.id =super.id+1;
    }
    @Override
    protected void echo(){
        System.out.println("sub " + id +" "+ name);
    }
}
public class Test16 {
    private static void test(Forg forg){
        System.out.println(forg.id);
    }
    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian();
        System.out.println(amphibian.id);
        amphibian.echo();
        Test16.test(amphibian);
        Forg forg = new Amphibian();
        System.out.println(forg.getClass());
        System.out.println(forg.id);
        forg.echo();


    }

}
