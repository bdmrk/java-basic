package info.kausar;

class ThisCal {
        int num1;
        int num2;

    public ThisCal(int number1, int number2) //local variable brown
    {
        this.num1 = number1;//global variable blue
        this.num2 = number2;
        //this keyword is used to refer for instance variable
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        ThisCal obj = new ThisCal(4, 5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}
