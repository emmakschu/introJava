/*
 * WizardTipCalculator.java
 * This program will accept user inputs for bill subtotal and desired tip
 * percentage, then calculate the appropriate tip and total just like Morty
 * Seinfeld's Wizard Tip Calculator (but no, this program does not have other
 * functions).
 *
 * Author:   Michael K Schumacher
 * Created:  28-10-2016
 * Modified: 28-10-2016
 */

// Import the Scanner class from java.util
import java.util.Scanner;

public class WizardTipCalculator
{
    public static void main(String[] args)
    {
        // Declare variables
        double subtotal;
        double tipPercent;
        double tipDecimal;
        double tipAmount;
        double grandTotal;

        // Create a Scanner object
        Scanner stdin = new Scanner(System.in);

        // Prompt user for input and assign to variables
        System.out.print("Enter the bill subtotal and desired tip %: ");
        subtotal = stdin.nextDouble();
        tipPercent = stdin.nextDouble();

        // Convert tip from percentage to decimal for calculations
        tipDecimal = tipPercent / 100;

        // Calculate the tip amount and grand total
        tipAmount = subtotal * tipDecimal;
        grandTotal = subtotal + tipAmount;

        // Print the results
        System.out.println("Subtotal: " + subtotal);
        System.out.println("+ tip (" + tipPercent + "%) = " + tipAmount);
        System.out.println("Total = " + grandTotal);
    }
}
