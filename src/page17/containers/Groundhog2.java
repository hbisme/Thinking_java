package page17.containers;

// 自己的类用来做hashMap的键的错误的例子 hashMap

public class Groundhog2 {
    protected int number;

    public Groundhog2(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog#" + number;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Groundhog2)obj).number == number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
