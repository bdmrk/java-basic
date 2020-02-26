package info.kausar;


/*
*Inner Class
* Member Class
* Static Class
* Anonymous Class
 */

class Outer {
    static int a;
    public void show() {

    }

   static class Inner //Outer$Inner.class
    {
    public void display(){
        System.out.println("Inner class into outer class");
    }
    }
}

public class InnerAndOuter {
    //variable , method, class
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

//        Outer.Inner obj1 = obj.new Inner();
        Outer.Inner obj1 = new Outer.Inner(); //if inner class is static
        obj1.display();
    }
}
