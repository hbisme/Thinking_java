package page8.polymorphism.music3;
import page8.polymorphism.music.Note;

class Instrument{
    void play(Note n){
        System.out.println("Instrument.paly() "+n);
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument{
    void play(Note n){
        System.out.println("Wind.paly() "+n);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    void play(Note n){
        System.out.println("Percussion.play() "+n);
    }
    String what(){
        return "Percussing";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    void play(Note n){
        System.out.println("Stringed.play() "+n);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind{
    @Override
    void play(Note n){
        System.out.println("Brass.paly()" + n);
    }
    @Override
    void adjust(){
        System.out.println("Adjust Brass");
    }

}

class Woodwind extends Wind{
    @Override
    void play(Note n){
        System.out.println("Woodwind.paly()" + n);
    }
    @Override
    String what(){
        return "Woodwind";
    }
}

public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e){
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
