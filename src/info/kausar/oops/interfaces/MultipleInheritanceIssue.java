package info.kausar.oops.interfaces;


interface Abc {
    void abc();

    default void show() {
        System.out.println("in abc interface");
    }
}

interface MyAbc {

    default void show() {
        System.out.println("In My Abc show");
    }
}

class DemoImplements implements Abc, MyAbc {

    @Override
    public void abc() {
        System.out.println("in demo implements");
    }

    @Override
    public void show() {
        Abc.super.show(); // solve by ambiguity issue
    }
}

public class MultipleInheritanceIssue {
    public static void main(String[] args) {
        Abc abc = new DemoImplements();
        abc.show();

    }
}
