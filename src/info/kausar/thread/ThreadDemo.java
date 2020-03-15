package info.kausar.thread;

//every time you extend Thread your class become thread
//whenever you extends Thread, it's you responsibility to override run method
class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }

    }

}

class Hello extends Thread{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj = new Hi();
        Hello obj2 = new Hello();
        obj.start(); // only after extending Thread Class
        try{ Thread.sleep(10); }catch (Exception e){} // interruption for 10 ms
        obj2.start(); // only after extending Thread Class


        // Whenever you call start method internally it call run();
        // so instead of creating show method create run method
//        obj.show();
//        obj2.show();
    }
}
