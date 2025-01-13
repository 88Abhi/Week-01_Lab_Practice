// Utility class to perform various operations on numbers
import java.util.Scanner;

class DigitChecker 
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) 
	{
        // A duck number cannot start with 0, skip the leading zeros
        while (number > 0) {
            if (number % 10 == 0) {
                return true; 
            }
            number /= 10;
        }
        return false; // Return false if no zero is found
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) 
	{
        // Get the count of digits and store them in an array
        int count = countDigits(number);
        int[] digits = storeDigits(number);
        int sum = 0;

        // Calculate the sum of digits raised to the power of count
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }

        // Return true if the sum equals the original number
        return sum == number;
    }

    // Method to find the largest and second-largest digits in an array
    public static int[] findLargestAndSecondLargest(int[] digits) 
	{
        // Initialize largest and second largest to minimum possible value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the two largest values
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        // Return the largest and second-largest as an array
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second-smallest digits in an array
    public static int[] findSmallestAndSecondSmallest(int[] digits) 
	{
        // Initialize smallest and second smallest to maximum possible value
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the array to find the two smallest values
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        // Return the smallest and second-smallest as an array
        return new int[]{smallest, secondSmallest};
    }

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

        // Check and display if the number is a duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Check and display if the number is an Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        // Find and display the largest and second-largest digits
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second-largest digit: " + largestTwo[1]);

        // Find and display the smallest and second-smallest digits
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second-smallest digit: " + smallestTwo[1]);

        // Close the Scanner object
        sc.close();
    }
}
