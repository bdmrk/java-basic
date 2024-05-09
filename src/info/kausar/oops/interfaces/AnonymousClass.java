package info.kausar.oops.interfaces;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

public class AnonymousClass {

    public static void main(String[] args) {
        A b = new B();
        b.show();

        A a = new A() {

            public void show() {
                System.out.println("hello i am in anonymous class");
            }
        };
        a.show();

    }
}
