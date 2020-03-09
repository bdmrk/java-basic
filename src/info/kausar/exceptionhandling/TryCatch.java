package info.kausar.exceptionhandling;
public class TryCatch {
    public static void main(String[] args) {
        try {
            int i = 9/0;
            System.out.println(i);

        }catch (ArithmeticException e) {
            System.err.println(e);
            System.out.println("if there is any error in try block it prints here");
        }
        finally {
            System.out.println("It prints every time");
        }
    }
}
