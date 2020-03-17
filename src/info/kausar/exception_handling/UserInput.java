package info.kausar.exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// printf - scanf
//cout - cin
//System.out.printLn() - System.in.read()
// BufferReader -> normally people don't prefer to use BufferReader they prefer scanner
// Scanner
 public class UserInput {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number");
//
//        int n = System.in.read();
//        System.out.println(n);

//        InputStreamReader is = new  InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(is);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // this line result same
        // to create object of buffer reader, first have to create InputStreamReader object passing System.in as parameter
        int n = Integer.parseInt(bufferedReader.readLine()); // convert input from user to integer
        System.out.println(n);

    }
}

