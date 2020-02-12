package page17.containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class SpringDetector2 {
    public static <T extends Groundhog2> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        HashMap<Groundhog2, Prediction> map = new HashMap<Groundhog2, Prediction>();

        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        System.out.println("map = " + map);
        Groundhog2 gh = ghog.newInstance(3);
        System.out.println("Looking up prediction for " + gh);
        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println("key not found: " + gh);
        }


    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog2.class);
    }
}
