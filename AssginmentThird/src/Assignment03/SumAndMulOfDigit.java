package Assignment03;

import java.util.Scanner;

public class SumAndMulOfDigit {

    public static void sumNum(int num){
        int sum = 0;
        int realNumValue = num;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.printf("Sum of digits of number %d is %d", realNumValue, sum);

    }

    public static void mulNum(int num){
        int mul = 1;
        int realNumValue = num;
        while (num != 0) {
            int lastDigit = num % 10;
            mul *= lastDigit;
            num /= 10;
        }
        System.out.printf("Multiplication of digits of number %d is %d", realNumValue, mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to calculate sum of digits");
        int number = sc.nextInt();
        sumNum(number);
        System.out.println();
        mulNum(number);

    }

}
