// This program finds all multiples of a given number below 100.

import java.util.Scanner;

class MultiplesBelow100 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display all multiples of the number below 100.
        System.out.println("The multiples of " + number + " below 100 are:");
        for (int i = 100; i > 0; i--) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
