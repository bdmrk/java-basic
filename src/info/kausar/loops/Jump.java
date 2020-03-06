package info.kausar.loops;

public class Jump {
    public static void main(String[] args) {
        for (int i = 1 ; i <=10 ; i++) {
            if (i ==7 || i ==6)
            {
                continue;
            }
            System.out.println("Continue value of i " + i);

        }

        for (int j = 1; j<=100; j++) {
            if (j >= 5){
                break;
            }
            System.out.println("Break value of j " + j);
        }

    }
}
