package info.kausar.array;

class Cals{
    public int add ( int ... n) // {1,5,10,15} //variable length arguments
    {
        int sum = 0;
        for (int i : n) {
            sum = sum+i;
        }
        return sum;
    }
}

public class VarAgrs //variable arguments
{
    public static void main(String[] args) {
    Cals obj = new Cals();
        System.out.println(obj.add(1,5,10,15));
    }
}
