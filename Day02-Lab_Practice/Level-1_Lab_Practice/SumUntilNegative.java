// This program calculates the sum of numbers entered by the user until they enter 0 or a negative number.
// The program uses a while loop with a break statement to stop when a non-positive number is entered.
import java.util.Scanner;

class SumUntilNegative 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Initialize a variable to store the total sum.
        double total = 0.0;

        // Use a while loop to continuously ask for input.
        while (true) {
            // Prompt the user to input a number.
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double userValue = input.nextDouble();

            // Check if the user entered 0 or a negative number. If yes, exit the loop.
            if (userValue <= 0) {
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
