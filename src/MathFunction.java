
import java.util.Locale;
import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        //s = ut+1/2 at^2
        //area =root under s(s-a)(s-b)(s-c)
        //x = -b +-root under b^2 - 4ac / 2a
        //String dis = ""
        double s, u, t, a,area, b,c,x;


        Scanner sc = new Scanner(System.in);
        System.out.println("Type distance or area or quadratic");
        String type = sc.next().toLowerCase(Locale.ROOT);
        //String lower = type.toLowerCase();
        String distance ="distance";
        String areas = "area";
        String quadratic = "quadratic";
        // if (s.equals(t))
        if (type.equals(distance)){
            System.out.println("Enter the value of Initial Value : ");
            u = sc.nextDouble();
            System.out.println("Enter the value of time : ");
            t = sc.nextDouble();
            System.out.println("Enter the value of Acceleration : ");
            a = sc.nextDouble();
            s = u * t + 0.5 * a * t * t;
            System.out.printf("Distance of enter value is: "+s);
        }
        else if(type.equals(areas)){

            System.out.println("Enter the value of a : ");
            a = sc.nextDouble();
            System.out.println("Enter the value of b : ");
            b = sc.nextDouble();
            System.out.println("Enter the value of c : ");
            c = sc.nextDouble();
            s = (a + b + c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            if (area <= 0) {
                System.out.printf("Area is negative");
            }
            else {
                System.out.printf("Area of enter value is %.2f: ",area);
            }
        }
        else if(type.equals(quadratic)){
            System.out.println("Enter the value of a: ");
            a = sc.nextDouble();
            System.out.println("Enter the value of b : ");
            b = sc.nextDouble();
            System.out.println("Enter the value of c : ");
            c = sc.nextDouble();

             x = b * b - 4.0 * a * c;


            if (x > 0.0) {
                double r1 = (-b + Math.pow(x, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(x, 0.5)) / (2.0 * a);
                System.out.println("The Quadratic equation roots are " + r1 + " and " + r2);
            } else if (x == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

        }

    }

}
