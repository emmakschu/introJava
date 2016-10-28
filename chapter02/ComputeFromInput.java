/*
 * ComputeFromInput.java
 * A program to demonstrate accepting user input and using this value to
 * perform basic calculations.
 *
 * Author:   Michael K Schumacher
 * Created:  27-10-2016
 * Modified: 27-10-2016
 */

// Import the Scanner class from the java.util package
import java.util.Scanner;

public class ComputeFromInput
{
    public static void main(String[] args)
    {
        // Declare variables and constants
        double radius;
        double area;
        final double PI = 3.14159;

        // Create Scanner object to read stdin
        Scanner input = new Scanner(System.in);

        // Prompt user for input and assign it to the radius
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();

        // Perform the calculation
        area = radius * radius * PI;

        // Print the result to the console
        System.out.println(area);
    }
}
