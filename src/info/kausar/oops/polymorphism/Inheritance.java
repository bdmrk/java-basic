package info.kausar.oops.polymorphism;
// Two relationship in inheritance =
// Is-A Relation => when extends a class
// Has-A Relation => when create an object of another class

class BasicCal //supper Class / Parent Class(in oops concept) / Base Class(in c++)
{
    public int add(int i, int j) {
        return i + j;
    }
}

class AdvCal extends BasicCal //sub class / Child Class (in oops concept)/ Derived Class Base Class(in c++)
{
    public int sub(int i, int j) {
        return i - j;
    }
}

class VeryAdvCal extends AdvCal {
    public int mul(int i, int j) {
return i*j;
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        AdvCal cal = new AdvCal(); //single level inheritance
//        int result = cal.add(5, 10);
//        int result2 = cal.sub(5, 10);
//        System.out.println(result);
//        System.out.println(result2);

                VeryAdvCal cal = new VeryAdvCal(); //multi level inheritance
        int result = cal.add(5, 10);
        int result2 = cal.sub(10, 7);
        int result3 = cal.mul(5, 10);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3 );

    }
}
