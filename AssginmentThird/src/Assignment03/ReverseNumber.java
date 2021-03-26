package Assignment03;

import java.util.Scanner;

public class ReverseNumber {
    //Write a Program to reverse the given number. //123 => 321

    void reverseNumber(int num){
          // if input number is 123 the following logic will be executed in code.
        int reverseNum =0;
        while( num != 0 )//123!=0, 12!=0, 1!=0, 0!=0 false so loop stop
        {
            reverseNum = reverseNum * 10;//0*10=0, 3*10 = 30, 32*10 = 320
            //System.out.println(reverseNum);
            reverseNum = reverseNum + num % 10; //0+123%10 = 0+3= 3, 30+12%10 = 30+2 = 32 , 320+1%10 = 320+1 = 321
            //System.out.println(reverseNum);
            num = num / 10; // 123/10 = 12, 12/10 =1, 1/10 = 0
            //System.out.println(num);
        }

        System.out.println("Reverse of input number is: "+reverseNum);
    }
    public static void main(String[] args) {
        ReverseNumber rn =new ReverseNumber();

        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        rn.reverseNumber(num);



    }
}
