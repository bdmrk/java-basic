package info.kausar.loops;

public class EnhanceForLoop {
    public static void main(String[] args) {
        int a[] = {1,2,3};

//        for (int i=0; i<3; i++) {
//            System.out.println(a[i]);
//        }

        for (int k: a
             ) {
            System.out.println(k); //this is much more efficient to write less code

        }

        int d [] [] = {
                {1},
                {4,5},
                {7,8,9},
                {1,3,5,7}, //Jagged Array .
                {1,3,5,7,9}, // if the number of index is not assigned then it calls jagged array
        };

        for (int k [] : d) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }

    }
}
