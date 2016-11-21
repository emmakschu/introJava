/*
 * KelvinToFahrenheit.java
 * This program will take user input for a temperature in Kelvin, convert it
 * to degrees Fahrenheit, and print the result.
 *
 * Author:   Michael K Schumacher
 * Created:  28-10-2016
 * Modified: 28-10-2016
 */

// Import the Scanner class from java.util
import java.util.Scanner;

public class KelvinToFahrenheit
{
    public static void main(String[] args)
    {
        // Declare variables
        double kelvinTemp;
        double fahrenheitTemp;

        // Create Scanner object
        Scanner stdin = new Scanner(System.in);

        // Prompt user for input and assign to Kelvin variable
        System.out.print("Enter a temperature in Kelvin: ");
        kelvinTemp = stdin.nextDouble();

        // Convert to Fahrenheit
        fahrenheitTemp = (kelvinTemp - 273.15) * 1.8 + 32;

        // Print the result
        System.out.println(kelvinTemp + " K is " + fahrenheitTemp + " deg F");
    }
}
