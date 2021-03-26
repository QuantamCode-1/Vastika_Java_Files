package AcceptingName;

import java.util.Scanner;

public class CheckingTriangle {
    static void identifyingTriangle(int x, int y, int z) // if you put void here you cannot call method using int in main function.
    {

        if (x == y && y == z ) {
            System.out.println("Triangle is Equilateral Triangle");
        }
        else if (x == y || y == z || z == x ) {
            System.out.println("Triangle is Isosceles Triangle");
        }
        else {
            System.out.println("Triangle is Scalene Triangle");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter three sides of Triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        identifyingTriangle(a,b,c);;
    }
}
