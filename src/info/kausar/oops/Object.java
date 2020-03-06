package info.kausar.oops;

class Calc{
    int num1 =2;
    int num2 =5;
    double result; //object knows these variables

    public void perform(){
        result = num1 + num2;
    }
    //object do something in method
}

public class Object {
    public static void main(String[] args) {
//        Calc obj; //this is reference
//        obj = new Calc(); // new allocate memory for new object

        Calc obj = new Calc(); //single line reference and object//
        //Object knows something and object do something

        obj.perform();

        System.out.println(obj.result);
    }
}
