// Class to check if a number is an Armstrong number
import java.util.Scanner;

class ArmstrongChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user for the number
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = input.nextInt();

        // Initialize variables for sum and original number
        int originalNumber = number;
        int sumOfCubes = 0;

        // Use a while loop to calculate the sum of the cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract the last digit
            sumOfCubes += Math.pow(digit, 3); // Add cube of the digit to the sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the sum of cubes equals the original number
        if (sumOfCubes == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the Scanner object
        input.close();
    }
}
