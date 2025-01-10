// This program calculates the sum of the first n natural numbers.
import java.util.Scanner;

class NaturalNumberSum 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Take a number as input from the user.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the input is a natural number.
        if (number >= 0) {
            // Calculate the sum of the first n natural numbers using the formula n * (n + 1) / 2.
            int sum = number * (number + 1) / 2;

            // Print the sum of the natural numbers.
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Print a message if the input is not a natural number.
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
