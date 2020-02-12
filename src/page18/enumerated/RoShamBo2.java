package page18.enumerated;
import static page18.enumerated.Outcome.*;

public enum  RoShamBo2 implements Competitor<RoShamBo2>{
    PAPER(DRAW, LOSE, WIN),
    SCISSORS(WIN, DRAW, LOSE),
    ROCK(LOSE, WIN, DRAW);



    private Outcome vPPAER, vSCISSORS, vROCK;

    RoShamBo2(Outcome paper, Outcome scissors, Outcome rock) {
        this.vPPAER = paper;
        this.vSCISSORS = scissors;
        this.vROCK = rock;
    }

    @Override
    public Outcome compete(RoShamBo2 it) {
        switch (it) {
            default:
            case PAPER: return vPPAER;
            case SCISSORS: return vSCISSORS;
            case ROCK: return vROCK;
        }
    }


    public static void main(String[] args) {
        RoShamBo.play(RoShamBo2.class, 20);
    }

}
