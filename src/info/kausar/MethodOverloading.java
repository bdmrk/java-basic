package info.kausar;

class Casio {
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, int j, int k)  //same named multiple method with different parameter is method overloading
    {
        System.out.println(i + j);
    }

    public void add(double i, double j) {
        System.out.println(i + j);
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(5, 6);

        obj.add(10, 15, 25);

        obj.add(25.2, 20.5);
    }
}
