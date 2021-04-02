package Assignment03;

import java.util.Scanner;



 public class SumArray {
    // data member
    private static int[] mAccept;
    static Scanner sc = new Scanner (System.in);// declaring Scanner object global to all

    // creating empty constructor
   public SumArray(){
       System.out.println("Enter the elements: ");
    }

    // declaring constructor with single array parameter
   public SumArray(int[] elements){

           // always constructor calling must be in first line other wise throw error
             this();  // calling SumArray() constructor here
             int sum = 0;
             String inputNumber = "The sum of given ";
             for(int i = 0; i < elements.length; i++){
                 elements [i] = sc.nextInt();
                 sum = sum +elements[i];
                 inputNumber = inputNumber +" "+ elements[i];
             }
             inputNumber = inputNumber + " different Number is = "+sum+ ".";
           //System.out.print("The Sum of Given "+elements.length +" different Number is " + sum);
            System.out.println(inputNumber);

    }


    public static void main(String[] args) {

        System.out.println("How many Number do you want to Enter");
        int input = sc.nextInt();
        mAccept = new int[input];

        // since you created the constructor so pass value here in argument otherwise
        // it throw the error either create empty constructor or don't create any
        SumArray  s = new SumArray( mAccept);
        sc.close(); // closing scanner
    }

}
