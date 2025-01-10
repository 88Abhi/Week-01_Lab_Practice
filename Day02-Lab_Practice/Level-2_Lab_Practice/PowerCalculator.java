// This program calculates the power of a number.
// It uses a loop to compute number^power.

import java.util.Scanner;

class PowerCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the base and power.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base and the power.
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize the result variable to 1.
        int result = 1;

        // Use a loop to multiply the base number by itself `power` times.
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result.
        System.out.println(number + " raised to the power of " + power + " is " + result);

        // Close the Scanner to release resources.
        input.close();
    }
}
