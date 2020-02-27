package info.kausar;


public class Array {
    public static void main(String[] args) {
        int employee[] = new int[4]; //default value of array index is 0 in java

        employee[0] = 8; //set new value of array
        employee[1] = 10;
        employee[2] = 12;
        employee[3] = 14;

        employee[0] = 100; //again set value and it will be the result

        //System.out.println(employee[0]); //for particular index
        for (int i = 0; i < 4; i++) {
            System.out.println(employee[i]);
        }

        int d [] [] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };
        System.out.println("First row third element = " + d[0][2]);

        //for print array in array / 2d array

        for (int i =0; i<4; i++){ //for number of array
            for (int j =0; j<3; j++ ){ // for number of elements
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

    }
}
