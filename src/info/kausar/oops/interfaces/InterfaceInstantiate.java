package info.kausar.oops.interfaces;

interface Human {
    public void walk();
}

class ImplementHuman implements Human {

    @Override
    public void walk() {
        System.out.println("hello human walk");
    }
}

public class InterfaceInstantiate {

    public static void main(String[] args) {

        Human implementHuman = new Human() {
            public void walk() {
                System.out.println("hello human from anonymous class in interface");
            }
        };

        implementHuman.walk();
    }
}
