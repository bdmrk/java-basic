package info.kausar.basic.conditions;

public class Condition {
    public static void main(String[] args) {
        int num = 6;
        int z = 0;

        //if else statement
        if (num >= 6) {
            z = 10;
        } else if (num < 6) {
            z = 5;
            System.out.println(z + "is less than 6");
        }
        System.out.println(" New value of z is " + z);

        //ternary operator
        z = num > 2 ? 1 : 0;
        System.out.println("After using ternary operator value of z is " + z);

        //switch case
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Six");

        }
    }
}
