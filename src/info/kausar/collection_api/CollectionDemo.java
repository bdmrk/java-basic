package info.kausar.collection_api;
// Collection Basically a collection of elements which can be integer/float
// it can be a collection of object

// ctrl + shift + o = to import the package we need!

import info.kausar.oops.Object;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4); // Integer v = new Integer();
        numbers.add(5);
        numbers.add(6);

//        System.out.println("Collection =" + numbers);

        //Collection can't fetch data with index number . so we need to do


        Iterator it = numbers.iterator();

        while (it.hasNext()) {
//            hasNext() method will check the next element existence
            System.out.println("while Iterator = " + it.next());
        }

        List<Integer> numbers2 = new ArrayList<>(); // mutable
        numbers2.add(10);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(7);
        Iterator<Integer> it2 = numbers2.iterator();
        while (it2.hasNext()) {
            System.out.println("Iterator after Iterator = " + it2.next());
        }

        Set<Integer> number3 = new HashSet<>();

        number3.add(8);
        number3.add(4);
        number3.add(5);
        number3.add(7);

        Iterator<Integer> it3 = number3.iterator();

        while (it3.hasNext()) {
            System.out.println("Iterator after Iterator 3 = " + it3.next());
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("i for loop = " + i);
        }

        Collections.sort(numbers2); // sort class
        Collections.reverse(numbers2);
        Collections.shuffle(numbers2);
        for (Number o : numbers2) {

            System.out.println("enhance for loop = " + o);

        }
        // Map<Integer, String> map = new HashMap<>();
//        Set<Integer> map = new TreeSet<>();
    }


}
