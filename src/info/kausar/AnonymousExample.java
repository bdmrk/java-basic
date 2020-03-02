package info.kausar;

class Ano {
    public void show() {
        System.out.println("in class Ano");
    }
}

// never create a class only for overriding
//class Bno extends Ano {
//    public void show() {
//        System.out.println("I am the best");
//    }
//}
public class AnonymousExample {
    public static void main(String[] args) {
        Ano obj = new Ano()
        { //this is anonymous class as it has no name
            // only for one time use
            public void show() {
                System.out.println("I am the best");
            }
        };

        obj.show();
    }
}
