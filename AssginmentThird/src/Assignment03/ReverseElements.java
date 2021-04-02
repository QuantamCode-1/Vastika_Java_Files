package Assignment03;


import java.util.Scanner;

 class ReverseElements  {

    public static String reverseString(String str){
        {

            // return if string is null or empty
            if (str == null || str.equals(""))
                return str;
            // get string length
            int n = str.length();
            // create a character array of same size as that of string
            char[] temp = new char[n];

            // fill character array backwards with characters of the string
            for (int i = 0; i < n; i++)
                temp[n - i - 1] = str.charAt(i);

            // convert character array to string and return it
            return String.copyValueOf(temp);


        }

    }


    public static void main(String[] args) {
        ReverseElements re = new ReverseElements();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be Reverse");
        String input = sc.nextLine();
        //reverseString(input);
        System.out.println("The Reverse String is: "+reverseString(input));
    }
}
