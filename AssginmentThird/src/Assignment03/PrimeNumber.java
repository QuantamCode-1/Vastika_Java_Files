package Assignment03;
import java.util.Scanner;

public class PrimeNumber {
    public static String isPrimeNumber(int num){

            if (num < 0) {
                return "not valid";
            }
            if (num == 0 || num == 1) {
                return "not prime number";
            }
            if (num == 2 || num == 3) {
                return "prime number";
            }
            if ((num * num - 1) % 24 == 0) {
                return "prime number";
            } else
                {
                    return "not prime number";
                }
    }

    static void firstNthPrime(int nth){
        int count = 0;
        int num = 1;
        int i;

        while (count < nth){
            num=num+1;
            for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){//if it is a prime number
                count = count + 1;
            }
        }
        System.out.println("Value of nth that is "+nth+" prime: " + num);

    }
    static void allPrimeBetween(int firstNum, int secondNum){
        int i;
        int num;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= secondNum; i++)
        {
            int counter=0;
            for(num = i; num >= firstNum; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from " + firstNum+ " to " + secondNum +" are : " +primeNumbers);


    }

    public static void main(String[] args) {
        //Write a program in a single class having the following functions.
        //isPrimeNumber(int)
        //firstNthPrime(int )
        //allPrimeBetween(int start , int  end)
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number to check for Prime ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number to check for First Nth prime number ");
        int num2 = sc.nextInt();
        System.out.print("Enter First Number to check for Prime number between them ");

        int num3 = sc.nextInt();
        System.out.print("Enter First Second to check for Prime number between them ");
        int num4 = sc.nextInt();
        sc.close();
        System.out.println();
        System.out.println("Number "+num1+" is "+isPrimeNumber(num1));
        firstNthPrime(num2);
        allPrimeBetween(num3, num4);

    }
}
