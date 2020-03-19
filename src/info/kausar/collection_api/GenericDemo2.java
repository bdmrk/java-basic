package info.kausar.collection_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(404);
        list.add(502);
        list.add(403);
        list.add(501);

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i, Integer j) {
////                if (i % 10 > j % 10) {
////                    return 1;
////                } else {
////                    return 0;
////                }
//                //instead of if else we can use ternary operator
//                return i%10>j%10 ? 1 : 0;
//            }
//        };

//        all these upper code can be written by using lambda expression

        Comparator<Integer> comparator = (i, j) -> i % 10 > j % 10 ? 1 : -1; // sorting logic overriding


        Collections.sort(list, comparator); // sort base on last number

        for (Integer l : list) {
            System.out.println(l);
        }
    }

}
