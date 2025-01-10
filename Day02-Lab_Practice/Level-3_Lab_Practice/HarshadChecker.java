// Class to check if a number is a Harshad Number
import java.util.Scanner;

class HarshadChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user for the number
        System.out.print("Enter a number to check if it's a Harshad number: ");
        int number = input.nextInt();

        // Initialize variables for sum of digits and original number
        int sumOfDigits = 0;
        int originalNumber = number;

        // Use a while loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sumOfDigits += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the Scanner object
        input.close();
    }
}
