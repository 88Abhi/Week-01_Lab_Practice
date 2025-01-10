// Create a class named NumberSignChecker to check if a number is positive, negative, or zero.
import java.util.Scanner;

class NumberSignChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a number and store it in a variable.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero and display the result.
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
