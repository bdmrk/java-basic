package info.kausar.oops.interfaces;

//Java 1.8 there is static method in interface
//By default if variable inside the interface became constant
//abstract method, default method and static method

interface StaticAbc {
    int num = 100;

    void abc();

    static void show() {
        System.out.println("Hello this is Static method of  StaticAbc");
    }
}

class VariableIml implements StaticAbc {

    public void abc() {
//        num = 10;
    }
}


public class StaticMethodInInterface {

    public static void main(String[] args) {
        StaticAbc.show();
    }
}
