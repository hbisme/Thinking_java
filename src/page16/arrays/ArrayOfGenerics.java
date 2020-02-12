package page16.arrays;

import java.util.*;

import page16.BerylliumSphere2;

public class ArrayOfGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> [] ls;
        List[] la = new List[10];
        ls = (List<String> [])la;
        ls[0] = new ArrayList<String>();


        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();


        List<BerylliumSphere2> [] spheres = (List<BerylliumSphere2> [])new List[10];

        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new ArrayList<BerylliumSphere2>();
        }

    }
}
