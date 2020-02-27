package info.kausar;


public class Array {
    public static void main(String[] args) {
        int employee[] = new int[4]; //default value of array index is 0 in java

        employee[0] = 8; //set new value of array
        employee[1] = 10;
        employee[2] = 12;
        employee[3] = 14;

        employee[0] = 100; //set new value

        //System.out.println(employee[0]); //for printing particular index
        for (int i = 0; i < 4; i++) {
            System.out.println(employee[i]);
        }

        int d [] [] = {
                {1},
                {4,5},
                {7,8,9},
                {1,3,5,7}, //J  agged Array .
                {1,3,5,7,9}, // if number of index is not assigned then it calls jagges array
        };
        System.out.println("First row third element = " + d[0][0]); //to print specific element

        //for print array in array / 2d array

        for (int i =0; i<d.length; i++){ //for number of array
            for (int j =0; j<d[i].length; j++ ){ // for number of elements
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

    }
}
