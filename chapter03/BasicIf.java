/*
 * BasicIf.java
 * This program will demonstrate a simple one-way if statement by promting the
 * user for rectangle dimensions, and if either one entered is negative, it
 * will return an error message. This also uses the logic operator '||' for or.
 *
 */

import java.util.Scanner;

public class BasicIf
{
    public static void main(String[] args)
    {
        // Declare variables
        double width;
        double height;

        // Create a Scanner object
        Scanner stdin = new Scanner(System.in);

        // Prompt user for dimensions and assign to vars
        System.out.print("Enter a width and a height: ");
        width = stdin.nextDouble();
        height = stdin.nextDouble();

        // Test that both are positive values
        if (width < 0 || height < 0)
        {
            System.out.println("Error: A rectangle cannot have negative "
                    + "dimensions in real life.");
        }
    }
}
