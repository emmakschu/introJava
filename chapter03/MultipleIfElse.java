/*
 * MultipleIfElse.java
 * This program will demonstrate multiple if-else statements in a display of
 * (slightly) more complicated logic. Soccer/football table standings for an
 * overly simplified 2-team league based on the score submitted. If the score
 * was a draw, a nested if-else will determine top of the table by goal diff.
 *
 */

import java.util.Scanner;

public class MultipleIfElse
{
    public static void main(String[] args)
    {
        // Declare variables and initialize those not set by user
        String team1Name = "Team1";
        String team2Name = "Team2";
        int team1Pts = 6;
        int team2Pts = 6;
        int team1GD = 12;
        int team2GD = 9;
        int team1Score;
        int team2Score;

        // Create Scanner object
        Scanner stdin = new Scanner(System.in);

        // Prompt user for input and assign to variables
        System.out.print("Enter score (home [space] away): ");
        team1Score = stdin.nextInt();
        team2Score = stdin.nextInt();

        // Check what happened in the match with if...else statements
        if (team1Score > team2Score)
        {
            team1Pts += 3;
        }
        else if (team1Score < team2Score)
        {
            team2Pts += 3;
        }
        else
        {
            team1Pts++;
            team2Pts++;
        }

        // Now check which team has more points and print table
        if (team1Pts > team2Pts)
        {
            System.out.println(team1Name + " " + team1Pts);
            System.out.println(team2Name + " " + team2Pts);
        }
        else if (team2Pts > team1Pts)
        {
            System.out.println(team2Name + " " + team2Pts);
            System.out.println(team1Name + " " + team1Pts);
        }
        else
        {
            if (team1GD > team2GD)
            {
                System.out.println(team1Name + " " + team1Pts);
                System.out.println(team2Name + " " + team2Pts);
            }
            else
            {
                System.out.println(team2Name + " " + team2Pts);
                System.out.println(team1Name + " " + team1Pts);
            }
        }
    }
}
