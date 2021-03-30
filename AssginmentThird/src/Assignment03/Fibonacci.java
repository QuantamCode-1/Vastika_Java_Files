package Assignment03;
import java.util.Scanner;

class Second{
    public static void checkFibonacci(int count){
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }

}

public class Fibonacci extends Second {

    public static void main(String[] args) {
        // calling from different class by making object of that class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        checkFibonacci(num);

    }
}
