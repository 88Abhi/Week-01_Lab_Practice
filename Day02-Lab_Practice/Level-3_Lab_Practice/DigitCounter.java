// Class to count the number of digits in an integer
import java.util.Scanner;

class DigitCounter 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user for the number
        System.out.print("Enter a number to count its digits: ");
        int number = input.nextInt();

        // Initialize the digit count variable
        int count = 0;
        int originalNumber = number;

        // Use a while loop to count the digits
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the count
        }

        // Print the number of digits
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        // Close the Scanner object
        input.close();
    }
}
