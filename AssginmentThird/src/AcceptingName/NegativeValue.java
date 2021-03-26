package AcceptingName;

import java.util.Scanner;

public class NegativeValue {
    public static Scanner sc;

    //Write a program to print the number entered by the user only if the number entered is negative.
    //creating method for negative check
    public static void checkNumber(){

        boolean flag = true;

        while(flag) {
            System.out.println("Number Please");
            sc = new Scanner(System.in);
            int num = sc.nextInt();

                if (num >= 0) {
                    System.out.println(" ");

                } else {
                    System.out.println("You Enter the Number: " + num);
                    flag = false;
                }
            }
    }
    public static void main(String[] args) {

                         checkNumber();
    }
}
