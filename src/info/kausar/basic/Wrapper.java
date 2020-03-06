package info.kausar.basic;

// int , float, double => faster than wrapping
//Integer
// why need wrapper => some framework doesn't support primitive type like Hibernet, Collection APi

public class Wrapper {
    public static void main(String[] args) {
        int i = 5; // int i here is a variable
        // Integer a = new Integer(5); // a is an object here
        Integer a = new Integer(i); // primitive value in object called Boxing/ Wrapping

        int j = a.intValue(); // unboxing / unwrapping
        Integer k = a; //Auto Boxing
        int value = k ; //Auto Unboxing
        System.out.println(j);
        System.out.println(value);

        String str = "123";
        int numberParse = Integer.parseInt(str); // parse integer from string. parseInt is a static method
        System.out.println(numberParse);
    }

}
