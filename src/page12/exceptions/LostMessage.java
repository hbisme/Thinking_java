package page12.exceptions;


class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "a very important exception";
    }
}


class NoHumException extends Exception {
    @Override
    public String toString() {
        return "a trivial important exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws NoHumException {
        throw new NoHumException();
    }

    public static void main(String[] args) {
        try {
            try {
                LostMessage lm = new LostMessage();

                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
