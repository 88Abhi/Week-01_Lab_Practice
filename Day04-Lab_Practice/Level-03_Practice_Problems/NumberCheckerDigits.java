// Utility class to perform various operations on numbers
import java.util.Scanner;
import java.util.Arrays;

class NumberCheckerDigits 
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

        // Extract digits from the number and store them in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; 
            number /= 10;           
        }

        // Return the array of digits
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) 
	{
        // Create a new array to store the reversed digits
        int[] reversed = new int[digits.length];

        // Loop to copy digits in reverse order
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        // Return the reversed array
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) 
	{
        // Use Arrays.equals to compare the arrays
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) 
	{
        // Reverse the digits array
        int[] reversed = reverseArray(digits);

        // Check if the original digits array is equal to the reversed array
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) 
	{
        // Loop through the digits array
        for (int digit : digits) {
            // Check if any digit is 0
            if (digit == 0) {
                return true;
            }
        }

        // Return false if no zero is found
        return false;
    }

    // Main method to demonstrate the utility methods
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Store the digits of the number
        int[] digits = storeDigits(number);

        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display the digits of the number
        System.out.print("Digits of the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Display the reversed digits
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();
		
		// Check and display if two arrays are equal
		System.out.println("Is Two Arrays are equal: " + areArraysEqual(digits, reversedDigits));

        // Check and display if the number is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(digits));

        // Check and display if the number is a duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        // Close the Scanner object
        sc.close();
    }
}
