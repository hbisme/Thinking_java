package package18.enumerated;

import java.util.EnumMap;

import static package18.enumerated.Input.*;

enum Category {
    MONEY(NICKEL, DIME, QUARTER, DOLLAR),
    ITEM_SELECTION(TOOTHPASTE, CHIPS, SODA, SOAP),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);

    private Input[] values;

    Category(Input... types) {
        values = types;
    }

    private static EnumMap<Input, Category> categories = new EnumMap<Input, Category>(Input.class);

    static {
        for (Category c : Category.class.getEnumConstants()) {
            for (Input type : c.values) {
                categories.put(type, c);
            }
        }
    }

    public static Category cateforize(Input input) {
        return categories.get(input);
    }
}

public class VendingMachine {

    private static State state = State.RESTING;
    private static int amount = 0;
    private static Input selection = null;

    enum StateDuration {TRANSIENT}

    enum State {
        RESTING {
            void next(Input input) {
                switch (Category.cateforize(input)) {
                    case MONEY:
                        amount += input.amount();
                        // state = ADDING_MONEY;
                        break;
                }
            }
        }
    }


    public static void main(String[] args) {

    }

}
