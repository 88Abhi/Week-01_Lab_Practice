// This program calculates the sum of numbers entered by the user until they enter 0.
// The program uses a while loop to continuously take input and add it to the total.
import java.util.Scanner;

class SumUntilZero 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Initialize a variable to store the total sum.
        double total = 0.0;

        // Declare a variable to hold the user-entered number.
        double userValue;

        // Use a while loop to keep taking input until the user enters 0.
        while (true) {
            // Prompt the user to input a number.
            System.out.print("Enter a number (enter 0 to stop): ");
            userValue = input.nextDouble();

            // Check if the user entered 0. If yes, exit the loop.
            if (userValue == 0) {
                break;
            }

            // Add the user-entered value to the total sum.
            total += userValue;
        }

        // Display the total sum of all entered numbers.
        System.out.println("The total sum of the entered numbers is: " + total);

        // Close the Scanner to release resources.
        input.close();
    }
}
