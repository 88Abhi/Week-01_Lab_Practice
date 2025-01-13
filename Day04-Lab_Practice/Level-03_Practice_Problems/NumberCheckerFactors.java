// Utility class to perform various operations on numbers
import java.util.Scanner;

class NumberCheckerFactors 
{
    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) 
	{
        // Count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; 
            }
        }

        // Store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; 
            }
        }
		
		// Return the factors array
        return factors; 
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) 
	{
		// Last element in sorted factors array
        return factors[factors.length - 1]; 
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) 
	{
		// Add each factor to sum
        int sum = 0;
        for (int factor : factors) {
            sum += factor; 
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static long findProductOfFactors(int[] factors) 
	{
		// Multiply each factor
        long product = 1;
        for (int factor : factors) {
            product *= factor; 
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static long findProductOfCubesOfFactors(int[] factors) 
	{
		// Multiply cube of each factor
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); 
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) 
	{
		// Find factors and store in factors array
        int[] factors = findFactors(number); 
        int sum = 0;

        // Sum proper divisors 
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
		// Check if sum equals the number
        return sum == number; 
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) 
	{
		// Find factors and store in factors array
        int[] factors = findFactors(number); 
        int sum = 0;

        // Sum proper divisors 
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
		
		// Check if sum is greater than the number
        return sum > number; 
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) 
	{
		// Find factors and store in factors array
        int[] factors = findFactors(number); 
        int sum = 0;

        // Sum proper divisors
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
		
		// Check if sum is less than the number
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) 
	{
        int temp = number;
        int sum = 0;

        // Calculate the sum of factorials of each digit
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); 
            temp /= 10;
        }
		// Check if sum equals the original number
        return sum == number; 
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) 
	{
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) 
	{
		// Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Call findFactors() and display results
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Call and display results of other methods
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        // Close the Scanner
        sc.close();
    }
}
