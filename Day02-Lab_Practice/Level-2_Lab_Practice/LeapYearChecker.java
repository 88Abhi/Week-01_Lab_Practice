// This program determines whether a given year is a leap year using multiple if-else statements.
// A year is a leap year if it is divisible by 4 but not divisible by 100 unless divisible by 400.
// The program only checks years greater than or equal to 1582 (Gregorian calendar).

import java.util.Scanner;

class LeapYearChecker 
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
            // Determine if the year is a leap year using multiple if-else statements.
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
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
