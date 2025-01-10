// Create a class named FactorialFor to compute the factorial of a number
// entered by the user using a for loop.
import java.util.Scanner;

class FactorialFor 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer.
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = input.nextInt();

        // Check if the entered number is positive.
        if (number >= 0) {
            // Initialize a variable to store the factorial result.
            long factorial = 1;

            // Use a for loop to calculate the factorial.
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply the current value of factorial by i.
            }

            // Display the calculated factorial.
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            // Display a message if the input is not a positive integer.
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
