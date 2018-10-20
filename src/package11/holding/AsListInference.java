package package11.holding;

import java.util.*;

class Snow {};
class Powder extends Snow{};
class Light extends Powder {};
class Heavy extends Powder {};
class Crusty extends  Snow {};
class Slush extends  Snow {};

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder()
        );

        List<Snow> snows2 = Arrays.asList(
                new Light(), new Heavy()
        );

        List<Snow> snows3 = new ArrayList<Snow>();
        Collections.addAll(snows3, new Powder(), new Light(), new Heavy());



    }
}
