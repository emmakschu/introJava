/*
 * ComputeMultipleInput.java
 * A program to demonstrate accepting multiple user inputs to assign to
 * variables, compute an expression and print the result to the console.
 *
 * Author:   Michael K Schumacher
 * Created:  28-10-2016
 * Modified: 28-10-2016
 */

// Import the Scanner class from the java.util library
import java.util.Scanner;

public class ComputeMultipleInput
{
    public static void main(String[] args)
    {
        // Declare all variables
        double length;
        double width;
        double area;
        double perimeter;

        // Create a Scanner object to collect input
        Scanner stdin = new Scanner(System.in);

        // Prompt user for measurements and assign to variables.
        System.out.print("Please enter rectangle width and height: ");
        width = stdin.nextDouble();
        length = stdin.nextDouble();

        // Calculate area and perimeter from user values
        area = width * length;
        perimeter = 2 * width + 2 * length;

        // Print the results to the console
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
