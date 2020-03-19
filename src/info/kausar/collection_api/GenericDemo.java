package info.kausar.collection_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();  // List is Mutable
        // Generic was introduced in 1.5 .
        // from 1.7 no need to pass Generic in constructor. only in reference
        list.add(25);
        list.add(5);
        list.add(10);
        list.add(15);

        Collections.sort(list); // sort is a static method of Collections
        Collections.reverse(list); // for descending order
        //There are many more method in Collections need to explore

        for (Integer l : list) {
            System.out.println(l);
        }

    }

}
