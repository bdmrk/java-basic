package info.kausar.exceptionhandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a [] = new int[6];
            a[6] = 100;
            int i = 10;
            int j = 2;
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
            System.out.println("if there is any error in try block it prints here");
        }

        finally {
            System.out.println("It prints every time whether success or error ");
        }
    }
}
