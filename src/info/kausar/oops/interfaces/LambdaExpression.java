package info.kausar.oops.interfaces;
//normal interface => has multiple methods
// single abstract method / SAM Interface / Functional Interface = only one abstract method
// Marker interface = No method

/*
===if we know functional interface we can use Lambda expression
=== Lambda expression comes from Scala as java adopted Sacala Language in java 8
*/
@FunctionalInterface
interface Sam {
void show();
}
public class LambdaExpression {
    public static void main(String[] args) {
//most people don't like java as it has lots of boilerplate code / boilerplate.

        //as Sam interface has only one method we can use show method in this way.
        Sam obj = () ->System.out.println("this is lambda expression"); // lamda expression
        //since we have only one statement we don't need any curly braces here
        obj.show();
    }
}
