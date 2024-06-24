package info.kausar.stream_api;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        values.forEach(System.out::println); //call by method reference
        values.forEach(i -> doubleIt(i)); // labmda
        values.forEach(MethodReference::doubleIt); // method reference
    }

    private static void doubleIt(int i) {
        System.out.println(i * 2);
    }
}

