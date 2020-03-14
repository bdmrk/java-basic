package info.kausar.thread;

public class ThreadPriority {
    public static void main(String[] args) throws Exception {
        //lambda expression with threads
        //anonymous class
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        // priority = 1-10, 1 = least priority, 5= default priority, 10 = highest priority

        t1.setPriority( Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread Priority t1= " + t1.getPriority());
        System.out.println("Thread Priority t2= " + t2.getPriority());

        t1.start();
        try{ Thread.sleep(10);}catch (Exception e) {};
        t2.start();
    }
}
