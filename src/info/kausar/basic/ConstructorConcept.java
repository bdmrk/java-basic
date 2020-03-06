package info.kausar.basic;

class Cal {
    int num1 ;
    int num2 ;
    double result;

    public Cal() { //default constructor as it doesn't have any parameter
        num1 = 5;
        System.out.println("default constructor");
    }

    public Cal(int z) { //signature change means declare another constructor with different parameter
        num1 = z;
        num2 = z;
        System.out.println("second constructor");
    }

    public Cal(double y) {
        result = y;
        System.out.println("third constructor");
    }

}

public class ConstructorConcept {
   /* Constructor -> member method
            -> Same name as class
            -> Never Return anything
            -> Default constructor
            -> used to allocate memory
            -> initialize value of property
            -> do not need to call constructor . because every time you create an object
    it will call the constructor automatically
             -> multiple constructor in same class with different parameter is called constructor overloading*/

    public static void main(String[] args) {
        Cal obj = new Cal(7); //constructor
        System.out.println(obj.num1);
        Cal object = new Cal(3.5);
        System.out.println(object.result);
    }

}
