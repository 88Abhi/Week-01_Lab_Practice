// This class generates and displays the multiplication table for a user-specified 
// number within the range of multipliers from 6 to 9.
import java.util.Scanner;

class MultiplicationInRange 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number. 
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        // Declare an array to store multiplication results for 6 to 9. 
        int[] table = new int[4];

        // Calculate the multiplication results for the range 6 to 9. 
        // Store each result in the array at the corresponding index.
        for (int i = 6; i <= 9; i++) {
            table[i - 6] = number * i;
        }

        // Display the multiplication table from 6 to 9. 
        System.out.println("Multiplication Table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + table[i - 6]);
        }

        // Close the Scanner object.
        input.close();
    }
}
