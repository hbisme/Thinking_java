package page15.generics;

public class ArrayOfGeneric {
    static final int size = 100;

    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        // gia = (Generic<Integer>[]) new Object[size];

        gia = (Generic<Integer>[]) new Generic[size];

        System.out.println(gia.getClass().getSimpleName());

        gia[0] = new Generic<Integer>();




    }


}
