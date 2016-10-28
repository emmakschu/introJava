/*
 * CircleArea.java
 * A program to demonstrate performing basic calculations with variables and
 * constants using Java.
 *
 * Author:   Michael K Schumacher
 * Created:  27-10-2016
 * Modified: 27-10-2016
 */

public class CircleArea
{
    public static void main(String[] args)
    {
        // Declare all variables and constants
        double radius;
        double area;
        final double PI = 3.14159;

        // Assign radius value
        radius = 12.8;

        // Perform calculation and assign to area variable
        area = radius * radius * PI;

        // Print the result to the console
        System.out.println(area);

    }
}
