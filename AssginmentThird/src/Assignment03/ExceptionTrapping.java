

package Assignment03;

import java.lang.reflect.Array;


static void trapIndexOutBound() {
        int[] arr = {10, 5, 4, 6, 15, 51, 20};
        try {
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n" + e.getMessage());
            System.out.println("ArrayIndexOutOfBoundException Occured");
        }

    }



static void trapArithmeticException() {
      
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception Occured");
        }
    }

public class ExceptionTrapping {
    public static void main(String[] args) {
  
        trapArithmeticException();
       trapIndexOutBound();
    }

  

    
}