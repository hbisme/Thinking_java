package page18.enumerated;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
