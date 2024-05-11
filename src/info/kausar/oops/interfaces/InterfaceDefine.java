package info.kausar.oops.interfaces;

// Abstract Class -> Define and declare
// Interface -> declare -> 1.7
// 1.8 define method in interface
// Functional interface must have only one abstract method but multiple default method

@FunctionalInterface
interface DefineInterface {
    void abc(); //abstract method

    default void show() {
        System.out.println("method definition");
    }


}

class DemoImplement implements DefineInterface {

    @Override
    public void abc() {
        System.out.println("abc method in implementation");
    }

    @Override
    public void show() {
        System.out.println("override show method definition");
    }
}

public class InterfaceDefine {
    public static void main(String[] args) {
        DefineInterface defineInterface = new DemoImplement();
        defineInterface.show();
        defineInterface.abc();
    }
}
