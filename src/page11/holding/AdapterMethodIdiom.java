package page11.holding;


import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>(){
                    int current = size() - 1;
                    public boolean hasNext(){
                        return current > -1;
                    };
                    public T next() {
                        return get(current--);
                    }
                    public void remove() {

                    }

                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
                Arrays.asList("To be or not to be".split(" ")));

        for(String s: ral){
                    System.out.println(s + " ");
        }

        System.out.println("-------");

        for(String s: ral.reversed()){
            System.out.println(s + " ");
        }


    }

}
