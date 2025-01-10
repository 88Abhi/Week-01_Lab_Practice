// This program determines whether a given year is a leap year using a single if statement.
// The conditions are combined using logical AND (&&) and OR (||) operators.

import java.util.Scanner;

class LeapYearCheckerLogical 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the year.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year.
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if the year is valid (Gregorian calendar starts from 1582).
        if (year >= 1582) {
            // Determine if the year is a leap year using a single if statement.
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            // Inform the user that the entered year is invalid.
            System.out.println("The year " + year + " is invalid. Please enter a year >= 1582.");
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
