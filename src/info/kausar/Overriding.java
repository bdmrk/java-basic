package info.kausar;

class One{
public void show() {
    System.out.println("in one class");
}
}

class Two extends One {

    @Override
    public void show() //override class One method show here
    {
        super.show(); //this will call Class One method show
        System.out.println("in class two");
    }

}
public class Overriding {
    public static void main(String[] args) {
    Two obj = new Two();
    obj.show();
    }
}
