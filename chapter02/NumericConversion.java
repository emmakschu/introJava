/*
 * NumericConversion.java
 * This program will compute a mean test score from two midterms and a final
 * using numeric type conversion to avoid integer division problems.
 *
 * Author:   Michael K Schumacher
 * Created:  28-10-2016
 * Modified: 28-10-2016
 */

public class NumericConversion
{
    public static void main(String[] args)
    {
        // Declare all variables
        int examCount;
        double midterm1;
        double midterm2;
        double finalExam;
        double mean;

        // Assign variable values
        examCount = 3;
        midterm1 = 94.0;
        midterm2 = 92.5;
        finalExam = 97.0;

        // Compute mean, converting examCount to double
        mean = (midterm1 + midterm2 + finalExam) / (double)examCount;

        // Print the result to the screen
        System.out.println(mean);
    }
}
