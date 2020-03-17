package info.kausar.exception_handling;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //using scanner you dont't have to convert string to int
        // you don't need to handle the exception
    }
}
