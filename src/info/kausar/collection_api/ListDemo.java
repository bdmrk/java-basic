package info.kausar.collection_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //List Extends Collection . So List hast all the features of Collection
        List list = new ArrayList();
        //List Accept Any type of value
        list.add(5); //this 5 is wrapper class object  = Integer v = new Integer(5) .
        list.add(10);
        list.add(15);
        list.add(0,2); // List Supports Index number
        list.add(1,"Hello"); // This is object of String

        // since List has index number

//        Iterator it = list.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //for loop
//        for (int i = 0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //enhance for loop

        for (Object l : list) {
            System.out.println(l);
        }
    }
}
