package AcceptingName;

import java.lang.*;
import java.util.*;
public class SimpleCalc {
    float a,b;
    char op;
    public static void main(String[] args)
    {
        SimpleCalc object = new SimpleCalc();
        object.main();
    }
    public void main()
    {
        char option;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        a = input.nextFloat();
        System.out.println("Enter operator");
        op = input.next().charAt(0);
        System.out.println("Enter Second number");
        b = input.nextFloat();
        switch(op)
        {
            case '+':
                add(a,b);
                System.out.println("Do another'(Enter y or Y for YES and n or N for NO)'");
                option = input.next().charAt(0);
                if(option == 'y' || option == 'Y'){
                    main();
                }
                else if(option == 'n' || option == 'N'){
                    System.exit(0);
                }
                break;
            case '-':
                sub(a,b);
                System.out.println("Do another'(Enter y or Y for YES and n or N for NO)'");
                option = input.next().charAt(0);
                if(option == 'y' || option == 'Y'){
                    main();
                }
                else if(option == 'n' || option == 'N'){
                    System.exit(0);
                }
                break;
            case '*':
                mul(a,b);
                System.out.println("Do another'(Enter y or Y for YES and n or N for NO)'");
                option = input.next().charAt(0);
                if(option == 'y' || option == 'Y'){
                    main();
                }
                else if(option == 'n' || option == 'N'){
                    System.exit(0);
                }
                break;
            case '/':
                div(a,b);
                System.out.println("Do another'(Enter y or Y for YES and n or N for NO)'");
                option = input.next().charAt(0);
                if(option == 'y' || option == 'Y'){
                    main();
                }
                else if(option == 'n' || option == 'N'){
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Enter the correct operator");
                break;
        }
    }
    public static void add(float x,float y)
    {
        System.out.println("the addition of given 2 numbers "+(x+y));
    }
    public static void sub(float x,float y)
    {
        System.out.println("the Subtraction of given 2 numbers "+(x-y));
    }
    public static void mul(float x,float y)
    {
        System.out.println("the multiplication of given 2 numbers "+(x*y));
    }
    public static void div(float x,float y)
    {
        if(y!=0){
            System.out.println("the division of given 2 numbers "+(x/y));
        }
        else{
            System.out.println("divide by zero with float numbers lead to infinity or NAN");
        }
    }
}
