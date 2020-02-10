package package17.containers;

import java.util.ArrayList;

import page15.generics.net.mindview.util.Generator;


public class CollectionDataMy<T> extends ArrayList<T> {

    public CollectionDataMy(Generator<T> gen, int quantity) {
        for(int i=0; i< quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionDataMy<T> list(Generator<T> gen, int quantity) {
        return new CollectionDataMy<T>(gen, quantity);
    }

    public static void main(String[] args) {
        // System.out.println(new ArrayList<String>(CollectionData.list(
        //
        // )));

        Thread.currentThread().stop();

    }
}
