package package17.containers;


import net.mindview.util.CollectionData;

import java.util.LinkedHashSet;

import net.mindview.util.Generator;

class Government implements Generator<String> {
    String[] foundation = ("Strange woman lying in ponds distributing swords is no basis for a system of government").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }

}
