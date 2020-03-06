package info.kausar.oops.inheritance;
//Java Doesn't support multiple inheritance directly. because it causes ambiguity/obscureness;
class A {
    public A() {
        System.out.println("A Constructor");
    }
    public A(int a) {
        System.out.println("A int Constructor");
    }
}

class B  extends A{
    public B() {
        //super(6); //if need to call parameterized
        System.out.println("B Constructor");
    }
    public B( int b) {
        //super(); //there is always super method hidden.
        super(b); //if need to call another constructor need to pass the parameter
        System.out.println("B int Constructor");
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
//        A objectA = new A();
       // B objectB = new B(); //when you create sub class object it calls its own and supper class constructor
        B objectB = new B(6); //whatever constructor you call in sub class it will call default constructor of super class B by default
        System.out.println(objectB);
//        System.out.println(objectA);

    }
}
