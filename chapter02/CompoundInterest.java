/*
 * CompoundInterest.java
 * This program will calculate the balance of an account accruing continuously
 * compounding interest, according to the simplified differential equation
 * Pe^(rt).
 *
 * Author:   Michael K Schumacher
 * Created:  28-10-2016
 * Modified: 28-10-2016
 */

// Import the Scanner class from java.util
import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[] args)
    {
        // Declare variables
        double principle;
        double ratePercent;
        double rateDecimal;
        double time;
        double exponent;
        double balance;

        // Create a Scanner object
        Scanner stdin = new Scanner(System.in);

        // Prompt user for input and assign to variables
        System.out.print("Enter the principle, rate(%), and time: ");
        principle = stdin.nextDouble();
        ratePercent = stdin.nextDouble();
        time = stdin.nextDouble();

        // Convert rate from percentage to decimal
        rateDecimal = ratePercent / 100;

        // Calculate the exponent r * t
        exponent = rateDecimal * time;

        // Calculate the expression Pe^(rt)
        balance = principle * Math.exp(exponent);

        // Print the result
        System.out.println(principle + " at " + ratePercent + "% for " + time
                + " cycles = " + balance);
    }
}
