package info.kausar.stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int i = 0; i < values.size(); i++) {
            System.out.println("Data with for loop=> " + values.get(i));
        }

        Iterator<Integer> j = values.iterator();
        while (j.hasNext()) {
            System.out.println("Data with Iterator =>" + j.next());
        }

        for (int k : values) {
            System.out.println("Data with enhance For Loop =>" + k);
        }

        // External Iterations
        // Internal Iteration
    }
}
