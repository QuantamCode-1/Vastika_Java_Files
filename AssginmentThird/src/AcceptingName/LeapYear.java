package AcceptingName;

import java.util.Scanner;

public class LeapYear {
    static boolean leap = false;
    public static void leapYear(int year){

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else {
                leap = true;
            }
        }
        else {
            leap = false;
        }
    }


    public static void main(String[] args) {
        //Write a program to calculate leap year.
        // year to be checked
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Years: ");
        int year = sc.nextInt();

        leapYear(year);

        if (leap) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
