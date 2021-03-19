package AcceptingName;

import java.util.Scanner;

public class EvenOdd {

    static void evenNum(int a){
        System.out.println("Given Number "+a+ " is Even.");
    }
    static void oddNum(int a){
        System.out.println("Given Number "+a+ " is Odd.");
    }

    public static void main(String[] args) {
        // Write a program to find the given number is even or odd.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if(num%2==0) {
            evenNum(num);
        }else{
            oddNum(num);
        }
    }
}
