package Assignment03;
import java.util.Scanner;

public class SumNaturalNumber {
    //Write a Program to sum 1 to nth natural numbers.

    public static void summingNumber(int sum){
        int i;
        int result = 0;
        for(i = 1; i<=sum; i++){
            result = result +i;
        }
        System.out.println("Sum of first "+sum+" natural numbers is: "+result);
    }
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Natural Number 'n':");
        input = sc.nextInt();
        //closing scanner after use
        sc.close();
        summingNumber(input);
    }
}
/*
*  int num, count, total = 0;


        System.out.println("Enter the value of n:");
        //Scanner is used for reading user input
        Scanner scan = new Scanner(System.in);
        //nextInt() method reads integer entered by user
        num = scan.nextInt();
        //closing scanner after use
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
*
* */