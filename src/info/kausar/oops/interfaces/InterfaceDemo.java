package info.kausar.oops.interfaces;

//in java 1.8 we can declare method by using default keyword


@FunctionalInterface
interface FunctionalDemo {
    void show(); //declare abstract method

    default void showMe() {
        System.out.println("define method");
    }

}


class DemoImp implements FunctionalDemo {

    @Override
    public void show() {
        System.out.println("demoImp show");
    }

    @Override
    public void showMe() {
        System.out.println("demoImp showMe");
    }

    public void abcImp() {
        System.out.println("in abc imp");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        FunctionalDemo obj = new DemoImp();
        DemoImp objImp = new DemoImp();
        obj.show();
        obj.showMe();
        objImp.abcImp(); // can access class method with its own obj


    }
}
