// This class contains methods to find the factors of a number and perform 
// various calculations on those factor
import java.util.Scanner;

class FactorFinder 
{
    // Method to find factors of the given number
    public static int[] findFactors(int number) 
    {
        // Initialize the counter to zero
        int count = 0;
        // Loop through all numbers from 1 to the given number 
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Create an array to store the factors of the number
        int[] factors = new int[count];
        int index = 0;

        // Loop again to store each factor in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Return the array containing the factors of the number
        return factors;
    }

    // Method to calculate the sum of the factors from the factors array
    public static int sumFactors(int[] factors)
    {
        // Initialize the sum to zero
        int sum = 0;

        // Loop through each element of the factors array and add it to the sum
        for (int factor: factors) {
            sum += factor;
        }

        return sum; // Return the calculated sum of factors
    }

    // Method to calculate the sum of squares of the factors
    public static int sumSquareFactors(int[] factors)
    {
        int sum = 0; // Initialize the sum to zero
        // Loop through each factor and add its square to the sum
        for (int factor: factors) {
            sum += Math.pow(factor, 2);
        }
        return sum; // Return the sum of squares of factors
    }

    // Method to calculate the product of the factors
    public static int productFactors(int[] factors) 
    {
        int product = 1; // Initialize the product to 1
        // Loop through the factors array and multiply each factor to the product
        for (int factor: factors) {
            product *= factor;
        }
        return product; // Return the final product of the factors
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call the findFactors method to get the factors of the number
        int[] factors = findFactors(number);

        // Call the sumFactors method to calculate the sum of factors
        int sum = sumFactors(factors);

        // Call the sumSquareFactors method to calculate the sum of squares of factors
        int sumOfSquares = sumSquareFactors(factors);

        // Call the productFactors method to calculate the product of factors
        int product = productFactors(factors);

        // Display the results of all calculations 
        System.out.println("Factors: " + java.util.Arrays.toString(factors) +
                           "\nSum of Factors: " + sum +
                           "\nSum of Squares of Factors: " + sumOfSquares +
                           "\nProduct of Factors: " + product);

        sc.close(); // Close the Scanner object to release the resources
    }
}