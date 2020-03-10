package info.kausar.exceptionhandling;

public class UserDefinedException {
    public static void main(String[] args)  {
        int i, j;
        j = 8;
        i = 9;


        try{
            int k = j / i;
            if( k == 0)
//                throw new  Exception();
                throw new CustomException("this is not possible");
            System.out.println(k);


        }catch (CustomException e ) {
//            System.err.println("Error " + e);
            System.err.println("Error! " + e.getMessage());
        }
    }
}
