package package17.containers;

// 自己的类用来做hashMap的键的错误的例子 hashMap

public class Groundhog {
    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog#" + number;
    }

}
