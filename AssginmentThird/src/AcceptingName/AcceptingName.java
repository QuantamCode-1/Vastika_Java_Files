package AcceptingName;
import java.util.Scanner;

public class AcceptingName {
    public static Scanner input1;


    public static void displayName(String name){

        System.out.println("Your Name is: "+ name);
    }

    public static int rollNumber(int roll){
        System.out.println("Your ROll Number is: " + roll);
        return 0;
    }
      // this is non-static method so we need to create object to call this method in main function.
     public String nationality(String national){

        System.out.println("Your Nationality is: "+national);
           return national;
    }



    public static void main(String[] args) {
        //Write a program to accept the roll, name, and nationality of the person
        // and display those values in good format.

        // If both String variable have nextLine() properties java have run time error without any
        // display of input value. So I changed one String input variable with nextLine() and other with
        // next() so program runs smoothly.

        // creating object of class to call non static method
        AcceptingName ac = new AcceptingName();
        input1 = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = input1.nextLine();


        System.out.println("Enter the Roll Number: ");
        int roll = input1.nextInt();


        System.out.println("Enter Nationality");
        String nationality = input1.next();


        displayName(name);
        rollNumber(roll);
        ac.nationality(nationality);

    }
}
