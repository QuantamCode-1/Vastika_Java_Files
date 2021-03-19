
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        //Write a program that reads the radius and length of a cylinder and computes volume.
        //volume of pi*r*r*h
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        double r, h ;
        System.out.println("Please Enter the radius: ");
        r = sc.nextDouble();
        System.out.println("Please Enter the Length");
        h = sc.nextDouble();
        double volume = pi * r * r * h;
        System.out.printf("The volume of cylinder is : %.2f",volume); // for decimal precision always use comma
                                                                      // not + sign in printf
    }

}
