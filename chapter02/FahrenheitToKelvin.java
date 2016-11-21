/*
 * FahrenheitToKelvin.java
 * This program will accept user input for a temperature in Fahrenheit, then
 * convert it to Kelvin and display the result.
 *
 * Author:   Michael K Schumacher
 * Created:  28-10-2016
 * Modified: 28-10-2016
 */

// Import the Scanner class from java.util
import java.util.Scanner;

public class FahrenheitToKelvin
{
    public static void main(String[] args)
    {
        // Declare all variables
        double kelvinTemp;
        double fahrenheitTemp;

        // Create Scanner object to read input
        Scanner stdin = new Scanner(System.in);

        // Prompt user for input and assign to Fahrenheit variable
        System.out.print("Enter a temperature in Fahrenheit: ");
        fahrenheitTemp = stdin.nextDouble();

        // Convert to Kelvin
        kelvinTemp = (fahrenheitTemp - 32) / 1.8 + 273.15;

        // Print the result
        System.out.println(fahrenheitTemp + " deg F is " + kelvinTemp + " K");
    }
}
