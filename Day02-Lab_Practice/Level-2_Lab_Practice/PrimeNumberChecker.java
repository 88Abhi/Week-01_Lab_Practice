// This program checks whether a given number is a prime number.
// A prime number is only divisible by 1 and itself and must be greater than 1.

import java.util.Scanner;

class PrimeNumberChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize a boolean variable to indicate if the number is prime.
        boolean isPrime = true;

        // Check if the number is greater than 1.
        if (number > 1) {
            // Loop through numbers from 2 to the square root of the input number.
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // If the number is divisible by any number other than 1 and itself, it is not prime.
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            // Numbers less than or equal to 1 are not prime.
            isPrime = false;
        }

        // Display whether the number is prime or not.
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
