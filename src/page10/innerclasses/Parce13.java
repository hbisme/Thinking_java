package page10.innerclasses;

public class Parce13 {
    class Contents {
        private int i = 11;
        public int value() {return i;}
    }

    class Destination {
        private String label;
        Destination(String whereTo) {label = whereTo;}
        String readLabel() {return label;}
    }

    public static void main(String[] args) {
        Parce13 p = new Parce13();
        Parce13.Contents c = p.new Contents();
        Parce13.Destination d = p.new Destination("Tasmania");
    }

}
