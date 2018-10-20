package package11.test;


import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(generate.next());
        System.out.println(generate.next());
        System.out.println(generate.next());
        System.out.println(generate.next());
        System.out.println(generate.next());
        System.out.println(generate.next());
        System.out.println(generate.next());

        List<String> list = new ArrayList<String>();
        list.add(generate.next());
        list.add(generate.next());
        list.add(generate.next());
        System.out.println(list);


    }
}

class generate {

    static String[] names = {"name1", "name2", "name3"};

    static int num = 0;

    public static String next() {
        String res ;
        if(num < names.length) {
            res = names[num];
        }else{
            res = names [num%names.length];
        }
        num ++;
        return res;
    }
}


