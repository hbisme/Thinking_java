package package11.holding;

import java.util.*;
public class Statistics {
    public static void main(String[] args) {
        Random  random = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i <1000 ; i++) {
            Integer key = random.nextInt(10);
            Integer num = hashMap.get(key);
            if(num == null) {
                num =0;
            }
            hashMap.put(key, num+1);
        }
        System.out.println(hashMap);
    }
}
