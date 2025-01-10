// This program finds all factors of a given number.

import java.util.Scanner;

class FactorsOfNumber 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display all factors of the number using a loop.
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
