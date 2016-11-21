/*
 * IfElse.java
 * This program will demonstrate a basic if-else statement, building on that
 * found in BasicIf.java. This time, it will produce the same error if either
 * rectangle dimension is negative, else it will calculate the area and
 * perimeter of the given rectangle.
 *
 */

import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        // Declare variables
        double width;
        double height;
        double area;
        double perimeter;

        // Create a Scanner object
        Scanner stdin = new Scanner(System.in);

        // Prompt user for dimensions and assign to variables
        System.out.print("Enter a width and a height: ");
        width = stdin.nextDouble();
        height = stdin.nextDouble();

        // Test that both are positive values
        if (width < 0 || height < 0)
        {
            System.out.println("Error: A rectangle cannot have negative "
                    + "dimensions in real life.");
        }
        // Else perform calculations and print results
        else
        {
            area = width * height;
            perimeter = 2 * (width + height);

            System.out.println("The rectangle with dimensions " + width + " x "
                    + height + " has:");
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}
