package page9.interfaces.music4;

abstract class Instrument{
    private int i;
    public abstract void play(int n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}
class Wind extends Instrument{
    @Override
    public void play(int n) {
        System.out.println("Wind.play():" + n);
    }
    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
    }
}
class Percussion extends Instrument{
    @Override
    public void play(int n) {
        System.out.println("Percussin.play() "+n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
    }
}


class Stringed extends  Instrument{
    @Override
    public void play(int n) {
        System.out.println("Stringed.play()" + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
    }
}

class Brass extends Wind{
    @Override
    public void play(int n) {
        System.out.println("Brass.play()" + n);
    }
    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class WoodWind extends Wind{
    @Override
    public void play(int n) {
        System.out.println("Woodwind.play()" + n);
    }

    @Override
    public String what() {
        return "Woodwind;";
    }
}

public class Music4_9_1 {
    static void tune(Instrument i){
        i.play(1);
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
                new WoodWind()
        };
        tuneAll(orchestra);
    }

}
