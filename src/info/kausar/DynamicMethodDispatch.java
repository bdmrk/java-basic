package info.kausar;

class First {
    public void show() {
        System.out.println("in class First");
    }
}

class Second extends First {
    public void show() {
        System.out.println("in class Second");
    }

    public void config() {
        System.out.println("in config method");
    }

}

class Third extends First {
public void show() {
    System.out.println("in class Third");
}
}

public class DynamicMethodDispatch {
    //compile time and run time polymorphism
    public static void main(String[] args) {
        First obj = new Second(); //run time
//         obj = new Third();
        obj.show(); // can't call config method . only common method between One and Two class
        obj = new Third();
        obj.show(); // dynamic method dispatch



    }
}
