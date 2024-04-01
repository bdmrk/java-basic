package info.kausar.oops.interfaces;
// Abstract Class =>
// abstract class is extended
// can define method
// doesn't support multiple inheritance
// fast

//Interface Class =>
// interface is implemented
// can't define method
// all the method by default public abstract
// support multiple implements
// slow
// can't create object of interface only references
// interface doesn't have any constructor
// use Interface only for multiple implementation


//abstract class Writer {
//    abstract public void write();
//}

interface Writer {
    void write(); //only can declare method not defining
    //public and abstract is assumed no need to declare here
}


class Pen implements Writer {
    public void write() {
        System.out.println("write with pen");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("write with pencil");
    }
}

class Kit {
    public void doSomething(Writer p) {
        p.write();
    }
}

public class Interface {
    public static void main(String[] args) {
;        Kit k = new Kit();
        Pen p = new Pen();
        Pencil pc = new Pencil();
        k.doSomething(p);
    }
}
