package info.kausar.exceptionhandling;
public class TryCatch {
    public static void main(String[] args) {
        try {
            int i = 9/0;

        }catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("hello World");
    }
}
