/*
 * Switch.java
 * This porgram will demonstrate a switch statement with multiple cases
 *
 * Author:   Michael K Schumacher
 * Created:  29-10-2016
 * Modified: 29-10-2016
 */

import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {
         // Declare variables
         String monthName;
         int daysInMonth;

         // Create Scanner object
         Scanner stdin = new Scanner(System.in);

         // Prompt user for input
         System.out.print("Enter the name of your birth month: ");
         monthName = stdin.next();

         switch(monthName.toLowerCase())
         {
             case "january":
             case "march":
             case "may":
             case "july":
             case "august":
             case "october":
             case "december":
                daysInMonth = 31;
                break;

             case "april":
             case "june":
             case "september":
             case "november":
                daysInMonth = 30;
                break;

            case "february":
                daysInMonth = 28;
                break;

            default:
                daysInMonth = 0;
                System.out.println("I didn't understand your input");
                break;
         }

         System.out.println("You were born in " + monthName + ", which has " +
                      daysInMonth + " days.");
    }
}
