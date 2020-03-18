package info.kausar.collection_api;
// Collection Basically a collection of elements which can be integer/float
// it can be a collection of object

// ctrl + shift + o = to import the package we need!

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(4);
        values.add(5);
        values.add(6);

        System.out.println("Collection =" +values);

        //Collection can't fetch data with index number . so we need to do

        Iterator it = values.iterator();

//        System.out.println("Iterator = " +it.next());
//        System.out.println("Iterator = " +it.next());
//        System.out.println("Iterator = " +it.next());
//        System.out.println("Iterator = " +it.next());
        //we don't know how many element do we have. so we need to do ..

        while (it.hasNext()) {
            //hasNext() method will check the next element exixtence
            System.out.println("while Iterator = " + it.next());
        }

    }


}
