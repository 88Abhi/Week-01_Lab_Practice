// This program extracts all the digits of a number entered by the user, stores them 
// dynamically in an array, and finds the largest and second-largest digits in the array.
import java.util.Scanner;

class DynamicLargestAndSecondLargestDigits 
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

        // Initialize an array to store digits with a starting size of 10.
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits from the number and store them in the array.
        while (number > 0) {
            // If the index reaches the current maximum size of the array.
            if (index == maxDigit) {
                // Increase the size of the array by 10.
                maxDigit += 10;

                // Create a new temporary array with the increased size.
                int[] temp = new int[maxDigit];
				
				// Manually copy the contents of the original digits array into the temp array.
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Reassign the digits array to the temp array.
                digits = temp;
            }

            // Add the last digit of the number to the array.
            digits[index++] = number % 10;

            // Remove the last digit from the number.
            number /= 10;
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
