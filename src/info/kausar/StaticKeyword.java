package info.kausar;

class Emp {
    int eId;
    int salary;
    //    String ceo;
    static String ceo; // for all employee set same value use static keyword

    public Emp()  //when you create an object it will be initialize automatically
    {
         eId =1;
        salary = 5000; // if no value is assigned this default value will be initialize
        System.out.println("constructor initialize");
    }

    static //when you load a class this block will be initialized
    {
        ceo = "Alo Begum";
        System.out.println("static block initialize");
    } // static block is special block. it runs only one time

    public void show() {
        System.out.println("Employee Id : " + eId + " , " + "Salary : " +  salary + " , " + "Ceo : " + ceo);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        Emp hasan = new Emp();
        hasan.eId = 1;
        hasan.salary = 20000;
//        Emp.ceo = "Tahiat"; // as ceo is static it is not necessary to assign in object level. it should be in class level

        Emp kausar = new Emp();
        kausar.eId = 2;
        kausar.salary = 30000;
//        Emp.ceo = "Zinat";

        kausar.show();
        hasan.show();
    }
}
