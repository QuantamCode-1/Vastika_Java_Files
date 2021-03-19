package AcceptingName;

import java.util.Scanner;
public class WeeksDays {

    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "It's a Monday";
                break;
            case 2:
                dayName = "It's a Tuesday";
                break;
            case 3:
                dayName = "It's a Wednesday";
                break;
            case 4:
                dayName = "It's a Thursday";
                break;
            case 5:
                dayName = "It's a Friday";
                break;
            case 6:
                dayName = "It's a Saturday";
                break;
            case 7:
                dayName = " It's a Sunday";
                break;
            default:
                dayName = "Invalid day range";
        }

        return dayName;
    }
    public static void main(String[] args) {
        //Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));

    }
}
