// Utility class to perform various operations on numbers
import java.util.Scanner;

class NumberCheckerPrime 
{
    // Method to check if a number is a prime number
    public static boolean isPrime(int number) 
	{
        // A prime number is greater than 1
        if (number <= 1) {
            return false;
        }

        // Check divisors from 2 to sqrt(number)
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // Number is not prime
            }
        }

        // Number is prime
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) 
	{
        // Calculate the square of the number
        int square = number * number;

        // Calculate the sum of digits of the square
        int sum = 0;
        while (square > 0) {
            sum += square % 10; 
            square /= 10;       
        }

        // Check if the sum is equal to the number
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) 
	{
        // Initialize sum and product
        int sum = 0, product = 1;

        // Calculate sum and product of digits
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;            
            product *= digit;       
            number /= 10;         
        }

        // Check if sum is equal to product
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) 
	{
        // Calculate the square of the number
        int square = number * number;

        // Check if square ends with the number itself
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) 
	{
        // A buzz number is divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check and display if the number is prime
        System.out.println("Is Prime: " + isPrime(number));

        // Check and display if the number is a neon number
        System.out.println("Is Neon: " + isNeon(number));

        // Check and display if the number is a spy number
        System.out.println("Is Spy: " + isSpy(number));

        // Check and display if the number is an automorphic number
        System.out.println("Is Automorphic: " + isAutomorphic(number));

        // Check and display if the number is a buzz number
        System.out.println("Is Buzz: " + isBuzz(number));

        // Close the Scanner object
        sc.close();
    }
}
