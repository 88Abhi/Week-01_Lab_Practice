// This program finds the greatest factor of a number (besides the number itself).

import java.util.Scanner;

class GreatestFactor 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the greatest factor to 1 (default if no factor is found).
        int greatestFactor = 1;

        // Use a loop to find the largest factor less than the number itself.
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop as soon as the greatest factor is found.
            }
        }

        // Display the greatest factor.
        System.out.println("The greatest factor of " + number + " (besides itself) is " + greatestFactor);

        // Close the Scanner to release resources.
        input.close();
    }
}
