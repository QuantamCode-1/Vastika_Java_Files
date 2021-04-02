package Assignment03;

import java.util.Scanner;

public class AscendingArray {

    // data member
    public static int[] mNum;
    final static Scanner sc= new Scanner (System.in); // no change the value of scanner sc so it is final declare

    // Write a Program to display numbers in ascending order in array.

    public int[] ascendingOrder(int [] num) {

        System.out.println("Enter the Number for Sorting Ascending");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }
        }
        return null; // since return type is array while making method we must pass null but not 0
    }

    public static void displayArrayElements(int[] display){

        System.out.print("Ascending Order is " +
                "" );
        for (int i = 0; i < display.length - 1; i++)
        {
            System.out.print(display[i] + ", ");
        }
        System.out.print(display[display.length - 1]);
    }




        public static void main(String[] args){

            AscendingArray aa = new AscendingArray();

            System.out.println("How many Number do you want to Enter");
            int input = sc.nextInt();
            mNum = new int[input];
            aa.ascendingOrder(mNum); // after array is sorted it goes to below method passing
            displayArrayElements(mNum);
        }
    }

