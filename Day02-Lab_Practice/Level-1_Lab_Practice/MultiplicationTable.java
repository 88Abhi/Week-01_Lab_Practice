// Create a class named MultiplicationTable to print the multiplication table
// of a user-provided number from 6 to 9.
import java.util.Scanner;

class MultiplicationTable 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number for which the table should be printed.
        System.out.print("Enter a number for its multiplication table: ");
        int number = input.nextInt();

        // Use a for loop to print the multiplication table from 6 to 9.
        for (int i = 6; i <= 9; i++) {
            // Calculate and display the result for the current multiplier.
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
