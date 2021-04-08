
package Assignment03;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class DuplicateName {
   public static void main(String[] args) throws IOException {
      ArrayList<String> list = new ArrayList<String>();
      File file = new File("weather.txt");
      Scanner input = new Scanner(file); 
      String prev = input.next();
      int count = 0;
      while (input.hasNext()) {
         String next  = input.next();
         System.out.println(next);
         set.add(next);
         count = count + 1;
         if(prev.equals(next))
         {
            System.out.println("Match found: -" + prev);
         }
         prev = next;
      } 

      System.out.println(list);
      System.out.println("Word count: " + count);
   }
}