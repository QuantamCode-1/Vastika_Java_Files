package AcceptingName;

import java.util.Scanner;

public class KeyFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // (an integer between 0 and 127)
        System.out.print("Enter an ASCII code: ");
        int num = input.nextInt();

        // Display ASCII code as character
        System.out.println((char)num);
    }
}