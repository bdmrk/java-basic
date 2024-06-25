package info.kausar.stream_api;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = 0;

        for (int i : values) {
            sum = sum + i;

        }
        System.out.println("sum = " + sum);
    }
}
