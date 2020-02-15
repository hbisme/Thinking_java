package page15.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMarker<T> {
    private Class<T> kind;

    public ArrayMarker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMarker<String>stringArrayMarker = new ArrayMarker<>(String.class);
        String[] stringArray = stringArrayMarker.create(9);
        System.out.println(Arrays.toString(stringArray));

    }

}
