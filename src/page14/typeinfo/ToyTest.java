package page14.typeinfo;

interface HasBatteries {}
interface Waterproof {}
interface Shoots{}

class Toy{
    Toy(){ }
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy(){
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " +  cc.getName() + "is interface? [" + cc.isInterface() + "]");
        System.out.println("Sample name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("page14.typeinfo.FancyToy");
        }catch (Exception e){
            e.printStackTrace();
        }

        printInfo(c);

        for(Class face: c.getInterfaces()){
            System.out.println(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try{
            obj = up.newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(obj.getClass());

    }


}
