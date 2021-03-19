package AcceptingName;

import java.util.Scanner;
public class LargestValueOfThree {
    //Write a program to display the largest number from given three values.
    public static int largest(int a, int b, int c){


        if (a>b && a>c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number");
        System.out.print("First Num: ");
        int num1 = sc.nextInt();
        System.out.print("Second Num: ");
        int num2 = sc.nextInt();
        System.out.print("Third Num: ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3){

              System.out.println("All the Given three number are Equal.");
        }
          else {
              int result = largest(num1, num2, num3);
              System.out.println("Out of Three Number " + num1 + "," + num2 + "," + num3 + " the greatest is: " + result);
          }
    }
}

