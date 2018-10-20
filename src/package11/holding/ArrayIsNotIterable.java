package package11.holding;

import java.util.*;
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for(T t:ib){
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings = {"a", "b", "c"};
//        数组没有实现Iterable接口,所以下面这行不会通过编译
//        test(strings);
        test(Arrays.asList(strings));
    }
}
