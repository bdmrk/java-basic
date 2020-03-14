package info.kausar.thread;

public class ThreadName {
    public static void main(String[] args) throws Exception {
        //lambda expression with threads
        //anonymous class
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }, "Hello Thread");

        //t1.setName("Hi Thread"); // in multi Threading thread name needs to be known for detection
        //t2.setName("Hello Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        try{ Thread.sleep(10);}catch (Exception e) {};
        t2.start();
    }
}
