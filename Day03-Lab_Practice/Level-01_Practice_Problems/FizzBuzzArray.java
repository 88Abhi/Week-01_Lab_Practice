// This class implements the FizzBuzz problem, storing results in an array. 
import java.util.Scanner;

class FizzBuzzArray 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number for the FizzBuzz range. 
        System.out.print("Enter a positive number for FizzBuzz: ");
        int number = input.nextInt();

        // Check if the input is valid (positive number). 
        // If invalid, display an error and exit the program.
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }

        // Initialize a String array to store FizzBuzz results. 
        String[] results = new String[number + 1];
		
        // Use conditions to determine Fizz, Buzz, or FizzBuzz.
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiple of 3 only
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiple of 5 only
            } else {
                results[i] = Integer.toString(i); // Regular number
            }
        }

        // Display the FizzBuzz results stored in the array. 
        System.out.println("FizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
