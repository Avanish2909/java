import java.io.*;

public class Exception3 {
/**    public static void main(String[] args) throws IOException{
        throw new IOException();
       // System.out.println("After Exception");
    }
 */

/**
        public static void main(String[] args) {
            throw new ArithmeticException();
            // System.out.println("After Exception");
        }
*/


        public static void main(String[] args){
        try{
            throw new ArithmeticException();
        // System.out.println("After Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Exception:"+e.getMessage());
            }
        }
}
