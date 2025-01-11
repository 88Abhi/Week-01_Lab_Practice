// LargestAndSecondLargestDigits Class extracts the digits of a number entered by the user, stores them 
// in an array, and finds the largest and second-largest digits in the array.
import java.util.Scanner;

class LargestAndSecondLargestDigits 
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

        // Initialize an array to store digits with a maximum size of 10.
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits from the number and store them in the array.
        while (number > 0) {
            // Add the last digit of the number to the array.
            digits[index++] = number % 10;

            // Remove the last digit from the number.
            number /= 10;

            // Break the loop if the index reaches the maximum size.
            if (index == maxDigit) {
                break;
            }
        }

        // Initialize variables to store the largest and second-largest digits.
        int largest = 0, secondLargest = 0;

        // Loop through the array to find the largest and second-largest digits.
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                // Update the second-largest to the current largest.
                secondLargest = largest;

                // Update the largest to the current digit.
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                // Update the second-largest if the current digit is greater.
                secondLargest = digits[i];
            }
        }

        // Display the largest and second-largest digits.
        System.out.println("The largest digit is: " + largest + 
                           ", and the second-largest digit is: " + secondLargest);

        // Close the Scanner object to release resources.
        input.close();
    }
}
