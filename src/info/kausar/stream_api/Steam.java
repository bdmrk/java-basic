package info.kausar.stream_api;

import java.util.ArrayList;
import java.util.List;

public class Steam {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            values.add(i);
        }
        values.parallelStream().forEach(i -> System.out.println("parallelStream stream" + i));
        values.stream().forEach(i -> System.out.println("stream" + i));
    }

}
