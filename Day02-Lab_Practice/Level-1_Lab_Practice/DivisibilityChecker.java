// Create a class named DivisibilityChecker to determine if a number is divisible by 5.
import java.util.Scanner;

class DivisibilityChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number and store it in a variable.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5 using the modulus operator.
        boolean isDivisibleByFive = (number % 5 == 0);

        // Display the result with a descriptive message.
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

        // Close the Scanner object to release resources.
        input.close();
    }
}
