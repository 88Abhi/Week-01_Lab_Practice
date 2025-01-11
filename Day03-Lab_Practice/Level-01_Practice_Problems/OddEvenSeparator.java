// OddEvenSeparator Class separates numbers into odd and even arrays from 
// 1 to a user-specified number and displays the results.
import java.util.Scanner;

class OddEvenSeparator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number. 
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Check if the input is valid (positive number). 
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }

        // Initialize arrays to store odd and even numbers. 
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Variables to keep track of the indices for odd and even arrays. 
        int oddIndex = 0, evenIndex = 0;

        // Loop through numbers from 1 to the user-specified limit. 
        // Separate each number into the odd or even array based on its type.
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Add to even array
            } else {
                oddNumbers[oddIndex++] = i; // Add to odd array
            }
        }

        // Display the odd numbers stored in the odd array. 
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Display the even numbers stored in the even array. 
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the Scanner object to release resources. 
        input.close();
    }
}
