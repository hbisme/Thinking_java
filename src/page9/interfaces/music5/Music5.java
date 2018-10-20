package page9.interfaces.music5;

interface Instrument{
    int VALUE = 5;  // 静态并且finally变量
    void play(int n);
    void adjust();
}
class Wind implements Instrument{
    @Override
    public void play(int n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " .adjust()");
    }
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument{
    @Override
    public void play(int n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust() ");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements  Instrument{
    @Override
    public void play(int n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}
class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i){
        i.play(10);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i:e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
