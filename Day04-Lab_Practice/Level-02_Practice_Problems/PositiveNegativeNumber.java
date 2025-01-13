// Class to analyze numbers for positivity, even and odd , 
// and perform comparisons
import java.util.Scanner;

class PositiveNegativeNumber 
{
    // Method to check if a number is positive
    public static boolean isPositive(int number) 
    {
        // Return true if the number is positive, otherwise return false
        return number > 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) 
    {
        // Return true if the remainder is zero, otherwise return false
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) 
    {
        // Compare the first number with the second
        if (num1 > num2) {
            // Return 1 if the first number is greater
            return 1;
        } else if (num1 == num2) {
            // Return 0 if both numbers are equal
            return 0;
        } else {
            // Return -1 if the first number is smaller
            return -1;
        }
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare an array to store 5 numbers provided by the user
        int[] numbers = new int[5];

        // Loop to take input for each number in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through each number in the array to analyze it
        for (int i = 0; i < numbers.length; i++) {
            // Call the isPositive method to check if the
            // current number is positive
            if (isPositive(numbers[i])) {
                // If the number is positive, call the isEven
                // method to check if it's even
                if (isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + 
                                       " is Positive and Even.");
                } else {
                    System.out.println("Number " + numbers[i] + 
                                       " is Positive and Odd.");
                }
            } else {
                // If the number is not positive, print that it is negative
                System.out.println("Number " + numbers[i] + 
                                   " is Negative.");
            }
        }

        // Compare the first and last numbers in the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        // Print the result of the comparison
        if (comparisonResult == 1) {
            // Print if the first number is greater than the last number
            System.out.println("The first number " + numbers[0] + 
                               " is greater than the last number " + 
                               numbers[numbers.length - 1] + ".");
        } else if (comparisonResult == 0) {
            // Print if the first and last numbers are equal
            System.out.println("The first number " + numbers[0] + 
                               " is equal to the last number " + 
                               numbers[numbers.length - 1] + ".");
        } else {
            // Print if the first number is smaller than the last number
            System.out.println("The first number " + numbers[0] + 
                               " is smaller than the last number " +
                               numbers[numbers.length - 1] + ".");
        }

        // Close the Scanner object to release resources 
        sc.close();
    }
}

