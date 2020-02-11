package package18.enumerated;

import net.mindview.util.Enums;

enum Activity{ SITITING, LYING, STANDING}

public class RandomTest {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println(Enums.random(Activity.class) + " ");
        }

    }

}
