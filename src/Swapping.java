public class Swapping {
    public static void main(String[] args) {
        //Write a program to swap two numbers
        //a) using temp variable
        //b) without temp variable
        int temp, a = 10, b = 20;
        System.out.println("Before swapping");
        System.out.println("a = " + a + " and b =  " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println("a = " + a + " and b =  " + b);
        System.out.println("=====================================");
        System.out.println("Swapping without using temp variable by assigning new value to a and b");
         a = 15;
         b = 5;
        System.out.println("Before swapping");
        System.out.println("a = " + a + " and b =  " + b);
        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After swapping:" + " a = " + a + ", b = " + b);
    }
}
