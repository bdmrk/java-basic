package info.kausar.loops;

public class Iteration {

    //repeating your code is a crime, don't repeat yourself
    //while , do while , for , for-each(enhance of for loop, especial loop made for array)

  public static void main( String[] args) {
      //while loop
      int i = 1 ;
      while( i <= 5)
      {
          System.out.println("hello world");
          i++;
      }

      //do while loop
      int j = 1;
      do {
          System.out.println("do while for 5 times");
          j++;
      }while ( j <= 5);

//for loop
      for (int z = 1 ; z <=5 ; z++) {
          System.out.println("value of z with for loop");
      }

      // * * * *
      // * * * *
      // * * * *
      // * * * *

      //nested loop
      for (int k = 1; k<=4; k++) {
          for(int x =1; x<=4 ; x ++) {
              System.out.print("*");
          }
          System.out.println("*");
      }

      for (int k = 1; k<=4; k++) {
          for(int x =1; x<=5 ; x ++) {
              System.out.print(x);
          }
          System.out.println();
      }

  }
}
