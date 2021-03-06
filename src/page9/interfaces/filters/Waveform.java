package page9.interfaces.filters;

public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}

class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}

class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}

class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}

 class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCutoff){
        this.lowCutoff = lowCut;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
