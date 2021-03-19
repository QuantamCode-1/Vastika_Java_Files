
import java.util.Scanner;
public class Conversion {
    //Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
    // Convert th temperature from fahrenheit to celsius formula
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Choose the 'f' for Fahrenheits and 'c' for Celsius");
        char far = sc.next().charAt(0);
  while(1 == 1) {
      if (far == 'f') {
          System.out.println("Please Enter the Number in Fahrenheits : ");
          double fahrenheit = sc.nextDouble();
          double celsius = (fahrenheit - 32) * 5 / 9;
          System.out.printf("Fahrenheits to Celsius is %.2f: ", celsius);
          System.exit(0);
      } else if (far == 'c') {
          System.out.println("Please Enter the Number in Celsius: ");
          double temperatureCelsius = sc.nextDouble();
          double fahrenheits = (temperatureCelsius * 9 / 5) + 32;
          System.out.printf("Fahrenheits to Celsius is %.2f: ", fahrenheits);
          System.exit(0);
      } else {
          System.out.println("Please Choose the Right Character Either 'f' or 'c' ");
          far = sc.next().charAt(0);
      }
  }

    }



}
