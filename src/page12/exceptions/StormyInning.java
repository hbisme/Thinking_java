package page12.exceptions;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}


abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}


public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {

    }

    public StormyInning(String s) throws Foul, BaseballException {

    }


    @Override
    public void atBat() throws Strike, Foul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    public void event() {
    }

    public static void main(String[] args) {

        StormyInning si = null;
        try {
            si = new StormyInning();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }

        try {
            si.atBat();
        } catch (Strike strike) {
            strike.printStackTrace();
        } catch (Foul foul) {
            foul.printStackTrace();
        }


        Inning i = null;
        try {
            i = new StormyInning();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }

        try {
            i.atBat();
        } catch (Strike strike) {
            strike.printStackTrace();
        } catch (Foul foul) {
            foul.printStackTrace();
        }


    }


}
