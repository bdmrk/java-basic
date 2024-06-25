package info.kausar.stream_api;

import java.util.Arrays;
import java.util.List;

public class FindFirstOrElse {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(99, 2, 3, 4, 21, 24, 356, 68, 100);
        int result = 0;

        for (int i : values) {
            if (i % 5 == 0) {
                result = i * 2;
            }
        }

        System.out.println("For Loop is Slow Process than stream Result: " + result);


//        System.out.println(values.stream()
//                .filter(i -> i % 5 == 0)
//                .map(i -> i * 2)
//                .findFirst() // Terminal Function
//                .orElse(0));


        // Method Reference to prove stream is fast
        System.out.println(values.stream()
                .filter(FindFirstOrElse::isDivisible)
                .map(FindFirstOrElse::doubleIt)
                .findFirst().orElse(0));
    }

    private static boolean isDivisible(int i) {
        System.out.println("int i=  " + i);
        return i % 5 == 0;
    }

    private static int doubleIt(int i) {
        System.out.println("double i" + i);
        return i * 2;
    }
}

/*
# Lazy Evaluation
# Terminal Function
 */