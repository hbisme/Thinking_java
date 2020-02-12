package page11.test;

import java.util.*;
public class Test18 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("key1",100);
        hashMap.put("key2",200);
        hashMap.put("key3",300);
        hashMap.put("key4",400);
        hashMap.put("key5",500);
        hashMap.put("key6",600);

        Set<Map.Entry<String, Integer>> entrys = hashMap.entrySet();
//        System.out.println("123".hashCode());
        System.out.println(hashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.putAll(hashMap);
        System.out.println(treeMap);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.putAll(treeMap);
        System.out.println(linkedHashMap);




    }
}
