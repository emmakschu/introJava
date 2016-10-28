/*
 * CircleCalculations.java
 * A simple program to demonstrate using Java to perform real-life calculations
 * such as finding the area and perimeter of a circle of given radius.
 *
 * Author:   Michael K Schumacher
 * Created:  27-10-2016
 * Modified: 27-10-2016
 */

public class CircleCalculations
{
    public static void main(String[] args)
    {
        // Calculate and print area of a circle with r = 7.2
        System.out.println("For a circle with radius = 7.2");
        System.out.print("Area: ");
        System.out.println(7.2 * 7.2 * 3.14159);

        // Calculate and print perimeter for the same circle
        System.out.print("Perimeter: ");
        System.out.println(2 * 3.14159 * 7.2);
    }
}
