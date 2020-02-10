package page15.generics.net.mindview.util;

import java.util.HashMap;
import java.util.Map;

public class New {
    public static <K,V> Map<K,V> map() {
        return new HashMap<K,V>();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = map();

    }

}
