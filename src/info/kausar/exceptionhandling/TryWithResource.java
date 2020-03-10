package info.kausar.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");

        // Form  java 1.7 it's not compulsory to write finally block
        //if we dont intend to handle Exception only close the job

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            //Try with resource

            n = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(n);

    }
}
