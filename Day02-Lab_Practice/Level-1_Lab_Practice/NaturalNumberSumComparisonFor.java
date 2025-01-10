// This program calculates the sum of n natural numbers using a formula and a for loop.
// It compares the results from both computations to verify correctness.
import java.util.Scanner;

class NaturalNumberSumComparisonFor 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number and store it in a variable.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (non-negative).
        if (number >= 0) {
            // Calculate the sum using the formula n * (n + 1) / 2.
            int formulaSum = number * (number + 1) / 2;

            // Calculate the sum using a for loop.
            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }

            // Display the results from both computations.
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare the sum calculated by formula and loop.
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        } else {
            // Inform the user if the input is not a natural number.
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
