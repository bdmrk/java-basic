package info.kausar;

//in java 1.8 we can declare method by using default keyword


@FunctionalInterface
interface Demo {
    void show(); //declare abstract method
    default void showMe() {
        System.out.println("define method");
    }
}

class DemoImp implements Demo {


    @Override
    public void show() {
        System.out.println("demoImp show");
    }

    @Override
    public void showMe() {
        System.out.println("demoImp showMe");
    }

    public void abcImp () {
        System.out.println("in abc imp");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
      Demo obj = new DemoImp() ;
      DemoImp objImp = new DemoImp();
    obj.show();
    obj.showMe();
    objImp.abcImp(); // can access class method with its own obj


    }
}
