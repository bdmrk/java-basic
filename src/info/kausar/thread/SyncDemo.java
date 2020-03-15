package info.kausar.thread;

class Counter {
    int count;
    // synchronized keyword doesn't allow two thread to access this increment method
    // if the method is synchronized it means only one Thread can work with this increment method
    // if you dont make your increment method synchronized that means your increment method or object is not Thread safe,
    // your class is not Thread safe which means multiple Thread can access the increment method same time
    public synchronized void increment(){
        count ++; // count = count + 1;

    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

       Thread t1 = new Thread(()->{
          for (int i=1; i <=1000; i++) {
              c.increment();
          }
       });

        Thread t2 = new Thread(()->{
            for (int i=1; i <=1000; i++) {
                c.increment();
            }
        });

       t1.start();
       t2.start();
       t1.join();
       t2.join();

        System.out.println("Counter = " + c.count);

    }
}
