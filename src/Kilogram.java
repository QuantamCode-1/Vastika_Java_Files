
import java.util.Scanner;



public class Kilogram {
    public static void main(String[] args) {
        /*Write a program that converts pounds into kg. The program prompts the user to enter a number
         of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].*/

        Scanner sc = new Scanner(System.in);
        float kiloGram,Pound;
        System.out.println("How Many Pounds do you want to convert into Kilograms");
        Pound = sc.nextFloat();
        kiloGram = Pound * (float)0.454;
        System.out.printf("Enter "+Pound+" Pound into Kilogram is: "+kiloGram);
    }
}
