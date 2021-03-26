package Assignment03;

import java.util.Scanner;

public class FactorialNumber {
    // Finding the factorial number of given number;
    public void factorialNumber(int fact){
        int i = 1;
        long factorial = 1;
        while(i <= fact)
        {
            factorial *= i;
            i++;
            System.out.print(factorial+" ");
        }
        System.out.println();
        System.out.printf("Factorial of %d = %d", fact, factorial);
    }

    public static void main(String[] args) {
        FactorialNumber ft = new FactorialNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to find factorial: ");
        int fact = input.nextInt();
        input.close();
        ft.factorialNumber(fact);
         }
    }

