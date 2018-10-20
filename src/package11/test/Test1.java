package package11.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Gerbil gerbil1 = new Gerbil(1);
        Gerbil gerbil2 = new Gerbil(2);
        Gerbil gerbil3 = new Gerbil(3);
//        System.out.println(gerbil.gerbilUnmber);
        List<Gerbil> arrayList = new ArrayList<Gerbil>();
        arrayList.add(gerbil1);
        arrayList.add(gerbil2);
        arrayList.add(gerbil3);
        for(int i = 0; i< arrayList.size(); i ++ ) {
            arrayList.get(i).hop();
        }
    }
}

class Gerbil {
    int gerbilUnmber;

    public Gerbil(int num) {
        this.gerbilUnmber = num;
    }

    public void hop() {
        System.out.println("this number is : " + gerbilUnmber);
    }
}

