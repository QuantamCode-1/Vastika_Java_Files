package Assignment03;

import  java.util.Scanner;
public class SecondLargest {

    //Write a function to find the second largest number in a given array.

    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }

    public static void main(String[] args) {
        //creating object for scanner class
        Scanner sc = new Scanner(System.in);

        // declaring variable array and integer
        int[] arrayElements;
        int input;

        // taking input form the user
        System.out.println("How many Elements want to Input");
        input = sc.nextInt();

        //Initializing array with new input elements
        arrayElements = new int[input];

        //finding the length of array elements
        int length = arrayElements.length;

        // using the for loop now asking the user to input the elements and storing in array to find second large elements
        System.out.println("Enter the Number to be find Second Largest ");
        for (int i = 0; i < length;i++ ){
            arrayElements[i] = sc.nextInt();
        }

        // creating variable display and giving method as value and passing the two argument arrayElements and length to method
        int display = getSecondLargest(arrayElements,length);

        //Printing the methods Elements
        System.out.println("The Second Largest Number from Given Numbers is: "+display);

    }
}
