package info.kausar.collection_api;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// The main difference between Set and List is Set will have all the unique value

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // As Set is an interface we had to find a class that implements Set.
        // and that is HasSet

        System.out.println(set.add(5));
        set.add(87);
        set.add(95);
        set.add(2555);
        System.out.println(set.add(5)); // this 5 will not be repeated
// HashSet fetch the nearest value first
        for (int i : set) {
            System.out.println("HashSet Values = " + i);
        }

        Set<Integer>  values = new TreeSet<>(); // TreeSet Fetch Value in ascending Order
        values.add(454);
        values.add(254);
        values.add(345);
        values.add(288);

        for (int j : values) {
            System.out.println("Tree Set value = " + j);
        }
    }
}
