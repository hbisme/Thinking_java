package page17.containers;

import java.util.Random;

public class Prediction {

    private static Random rand = new Random(47);

    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if(shadow) {
            return "Six mor weeks of Winter";
        }
        else {
            return "Early Spring";
        }
    }
}
