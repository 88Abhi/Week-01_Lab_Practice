// Create a class named OddEvenNumbers to determine whether numbers between 1 and
// a user-provided value are odd or even.
import java.util.Scanner;

class OddEvenNumbers 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the range.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the range (up to which numbers should be checked).
        System.out.print("Enter a positive integer as the range: ");
        int range = input.nextInt();

        // Check if the entered range is a natural number.
        if (range >= 1) {
            // Use a for loop to iterate through numbers from 1 to the user-provided range.
            for (int i = 1; i <= range; i++) {
                // Check if the current number is odd or even and display the result.
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            // Display a message if the input is not a natural number.
            System.out.println("Please enter a natural number greater than or equal to 1.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
