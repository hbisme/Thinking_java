package page11.holding;

import java.util.*;
public class MultiTierableClass extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>(){
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length -1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffied = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffied, new Random(47));
                return shuffied.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiTierableClass mic = new MultiTierableClass();
        for(String s: mic.reversed()){
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s: mic.randomized()){
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s: mic) {
            System.out.print(s + " ");
        }



    }

}
