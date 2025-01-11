// This program stores the digits of a number entered by the user into an array 
// and then displays the digits in reverse order.
import java.util.Scanner;

class ReverseDigits 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive number.
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate the input to ensure it is a positive number.
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive number.");
            System.exit(0);
        }

        // Find the number of digits and store them in an array.
        int temp = number, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Initialize an array to store the digits.
        int[] digits = new int[count];

        // Extract and store digits in the array.
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display the digits in reverse order.
        System.out.print("The reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        // Close the Scanner object.
        input.close();
    }
}
