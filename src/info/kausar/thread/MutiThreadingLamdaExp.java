package info.kausar.thread;

public class MutiThreadingLamdaExp {
    public static void main(String[] args) {
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
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        t1.start();
        try{ Thread.sleep(10);}catch (Exception e) {};
        t2.start();

    }
}
