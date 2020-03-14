package info.kausar.thread;

public class JoinIsAlive {
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


        System.out.println(t1.isAlive()); // t1 job is alive or not

        //Join isAlive
        // Method exception so need to throw Exception
        t1.join();

        System.out.println(t1.isAlive()); //  isAlive detect thread is active or not
        t2.join();
        System.out.println("Bye");

    }
}
