package AcceptingName;
import java.util.Scanner;

public class CheckingNumber {
    public static void equality(int a, int b){
        System.out.println("The "+a + " is equal to "+b+".");
    }
    public static void greater(int a, int b){
        System.out.println("The "+a + " is greater than "+b+".");

    }
    public static void smaller(int a , int b){
        System.out.println("The "+a + " is Smaller than "+b+".");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 == num2) {
            equality(num1, num2);
        }
        else if(num1 > num2){
            greater(num1, num2);
        }
        else{
            smaller(num1,num2);
        }
    }
}
