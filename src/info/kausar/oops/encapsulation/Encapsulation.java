package info.kausar.oops.encapsulation;

// Encapsulation => Binding data with methods

class Student{
   private int rollNo; //variable always should be private
    private String name;

    public int getRollNo() //method that access those variable should be public
    {
        System.out.println("user is accessing the vale"); //with the help of method we can maintain log file
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        System.out.println("user is changing the value"); //log
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter Setter
}

public class Encapsulation {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.setName("Kausar"); //Good practice to access variable through method
        s1.setRollNo(2);
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
    }
}
