
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        // perimeter of triangle is a+b+c
        // perimeter of square 4s
        // perimeter of rectangle is 2l +2w
        // Circumference of circle is 2 pi r
        double pi = 3.14;
        double sideA, sideB, sideC, length, width, radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Side 'a' of triangle");
        sideA = input.nextDouble();
        System.out.println("Please Enter Side 'b' of triangle");
        sideB = input.nextDouble();
        System.out.println("Please Enter Side 'c' of triangle");
        sideC = input.nextDouble();
        System.out.println("Please Enter Side length of Rectangle");
        length = input.nextDouble();
        System.out.println("Please Enter Side Width of Rectangle");
        width = input.nextDouble();
        System.out.println("Please Enter Radius of Circle");
        radius = input.nextDouble();

        double periTriangle = sideA + sideB + sideC;
        double periRectangle = 2 * length + 2 * width;
        double periCircle = 2 * pi * radius;

        System.out.printf("Perimeter of Triangle is: " +periTriangle +"\n" );
        System.out.printf("Perimeter of Rectangle is: " +periRectangle +"\n" );
        System.out.printf("Circumference of Circle is: " +periCircle+ "\n" );
    }
}
