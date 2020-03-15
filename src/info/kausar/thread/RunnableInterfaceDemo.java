package info.kausar.thread;

class Hi2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class Hello2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        Runnable obj = new Hi2();
        Runnable obj2 = new Hello2();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        try { Thread.sleep(10); } catch (Exception e) { }
        t2.start();

    }
}
