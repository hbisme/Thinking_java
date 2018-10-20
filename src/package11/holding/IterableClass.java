package package11.holding;

import java.util.*;
import java.util.function.Consumer;

public class IterableClass implements Iterable<String>{

    String [] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index =0;
            @Override
            public boolean hasNext() {
                return index< words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove(){

            }
        };
    }


    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }

    public static void main(String[] args) {
        for(String s: new IterableClass()){
            System.out.println(s + " ");
        }
    }
}
