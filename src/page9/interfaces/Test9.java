package page9.interfaces;



interface Instrument{
    int VALUE = 5;  // 静态并且finally变量
//    void play(int n);
    void adjust();
}

interface Playable{
    void play(int n);
}


abstract class Thing{
    public abstract int getId();
}

class Wind extends Thing implements Instrument,Playable{

    @Override
    public int getId() {
        return Instrument.VALUE;
    }

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

class Percussion implements Instrument,Playable{
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

class Stringed implements  Instrument,Playable{
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

public class Test9 {
    static void tune(Playable i){
        i.play(10);
    }
    static void tuneAll(Playable[] e){
        for(Playable i:e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);

        Wind wind = new Wind();
        System.out.println(wind.getId());
    }
}