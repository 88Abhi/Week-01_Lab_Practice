// Class to check if a number is an Abundant Number
import java.util.Scanner;

class AbundantChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user for the number
        System.out.print("Enter a number to check if it's an Abundant number: ");
        int number = input.nextInt();

        // Initialize sum of divisors variable
        int sumOfDivisors = 0;

        // Use a for loop to find and sum all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor
                sumOfDivisors += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        // Close the Scanner object
        input.close();
    }
}
