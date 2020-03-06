package info.kausar;
interface FirstInterFace {
    default void show() {
        System.out.println("in first interface");
    };
}

interface SecondInterface{
    default void show() {
        System.out.println("in second interface");
    };
}

class InterfaceDemoClass implements FirstInterFace, SecondInterface  {

    @Override
    public void show() {
        SecondInterface.super.show(); //call the same method from specific interface

    }

    public void abc(){
        System.out.println("in abc method");
    }
}

public class MultipleImplements  {
    public static void main(String[] args) {
        InterfaceDemoClass obj = new InterfaceDemoClass();
        obj.show();
        obj.abc();
    }


}
