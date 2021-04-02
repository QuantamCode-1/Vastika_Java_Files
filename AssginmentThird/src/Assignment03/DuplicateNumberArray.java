package Assignment03;

import java.util.Scanner;

class FindingArray{
    public void duplicateArray(int[] element, int length){
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(element[i] == element[j])
                    System.out.println(element[j]);
            }
        }
    }
}

public class DuplicateNumberArray extends FindingArray {
 //Write a function to find duplicate elements in an array.


    public static void main(String[] args) {


        //creating object of class
        DuplicateNumberArray dna = new DuplicateNumberArray();

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
        System.out.println("Enter the Number");
        for (int i = 0; i < length;i++ ){
            arrayElements[i] = sc.nextInt();
        }

        // calling the method using class objects
          dna.duplicateArray(arrayElements,length);
    }
}

