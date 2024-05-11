package info.kausar.oops.interfaces;


//Types of interface
// 1. normal interface
// 2. single abstract method -  Functional Interface - Lambda Expression
// Marker Interface
// Functional Interface have only on method

@FunctionalInterface
interface FunctionalAbc {
    void show();
}

public class InterfaceType {
    public static void main(String[] args) {
        FunctionalAbc fc = () -> System.out.println("Hello World interface with Lambda expression ");
        fc.show();
    }

}
