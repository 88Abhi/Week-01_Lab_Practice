// Utility class to perform various operations on numbers
import java.util.Scanner;

class NumberCheckPower 
{
    // Method to find the count of digits in a number
    public static int countDigits(int number) 
	{
        // Initialize count variable to 0
        int count = 0;

        // Loop to count digits until the number becomes 0
        while (number > 0) {
            count++;
            number /= 10; 
        }

        // Return the count of digits
        return count;
    }

    // Method to store the digits of a number in an array
    public static int[] storeDigits(int number) 
	{
        // Get the count of digits to create the array
        int count = countDigits(number);
        int[] digits = new int[count];

        // Extract digits from the number and store them in reverse order
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; 
            number /= 10;           
        }

        // Return the array of digits
        return digits;
    }

    // Method to find the sum of digits in a number
    public static int sumOfDigits(int[] digits) 
	{
        // Initialize sum to 0
        int sum = 0;

        // Loop through the array and add each digit to the sum
        for (int digit : digits) {
            sum += digit;
        }

        // Return the sum of digits
        return sum;
    }

    // Method to find the sum of squares of digits in a number
    public static int sumOfSquares(int[] digits) 
	{
        // Initialize sum to 0
        int sum = 0;

        // Loop through the array and add the square of each digit to the sum
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        // Return the sum of squares of digits
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) 
	{
        // Find the sum of digits using the sumOfDigits method
        int sum = sumOfDigits(digits);

        // Check if the number is divisible by the sum of its digits
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in a number
    public static int[][] findDigitFrequency(int[] digits) 
	{
        // Create a 2D array to store digits and their frequencies
        int[][] frequency = new int[10][2];

        // Initialize the digit column in the frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
            frequency[i][1] = 0; 
        }

        // Loop through the digits array and update the frequency array
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        // Return the frequency array
        return frequency;
    }

    // Main method to demonstrate the utility methods
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display the digits of the number
        int[] digits = storeDigits(number);
        System.out.print("Digits of the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));

        // Check and display if the number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        // Display the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) { 
                System.out.println("Digit: " + frequency[i][0] + ", Frequency: " + frequency[i][1]);
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
