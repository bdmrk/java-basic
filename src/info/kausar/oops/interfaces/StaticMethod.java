package info.kausar.oops.interfaces;

@FunctionalInterface
interface Demo {
    public void abc();

    int num = 8; // this variable becomes constant by default

    static void show() {
        System.out.println("Hello from static method");
    }
}

class DemoImpl implements Demo {

    @Override
    public void abc() {
        System.out.println("Hello from static method in Demo Impl class");
    }

}

public class StaticMethod {
    public static void main(String[] args) {
        Demo.show();
    }
}
