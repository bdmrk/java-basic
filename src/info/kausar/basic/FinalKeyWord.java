package info.kausar.basic;
// final keyword => with class, method and variable
// final variable is a constant
// no other class can extends final class / Non Inheritable
// no other method can override final method

class FinalA {
    final int DAY;  //final keyword make constant

    public FinalA() {
        DAY = 50;
    }
    final public void show() {
        System.out.println("in class FinalA");
    }
}

//class Any extends FinalA
// {
//    public void show() { // show can't be override
//
//    }
//}

public class FinalKeyWord {
    public static void main(String[] args) {
        FinalA obj = new FinalA();
        System.out.println(obj.DAY);
    }
}
