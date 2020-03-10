package info.kausar.multithreading;

class Hi {
    public void show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }

}

class Hello {

    public void show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj = new Hi();
        Hello obj2 = new Hello();
        obj.show();
        obj2.show();
    }
}
