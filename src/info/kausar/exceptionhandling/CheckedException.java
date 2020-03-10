package info.kausar.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// whatever come with the help of IO it becomes Resources
// IOException is not a part of Runtime Exception
//Subclass of Runtime Exception are unchecked
// Remaining all the Exceptions are checked exception

public class CheckedException {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");

        BufferedReader bufferedReader = null;
        try {
            //Create Resource in Try Block
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(bufferedReader.readLine());
        }catch (Exception e) {
            //Handle Resource in Catch Block
            System.err.println(e);

        }
        finally {
            //Close Resource in Finally block
            bufferedReader.close(); // it's our responsibility to close the job
        }
        System.out.println(n);

    }
}
