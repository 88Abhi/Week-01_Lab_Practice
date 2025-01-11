// FactorsFinder Class finds all factors of a user-specified number and 
// stores them in an array. It then displays the factors to the user.
import java.util.Scanner;

class FactorsFinder 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number. 
        System.out.print("Enter a positive number to find its factors: ");
        int number = input.nextInt();

        // Check if the input is valid (positive number). 
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }

        // Initialize an array to store factors. 
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find all factors of the number. 
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if the array needs resizing. 
                // Double the size if the current index exceeds the limit.
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; // Add factor to the array
            }
        }

        // Display the factors stored in the array. 
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Close the Scanner object.
        input.close();
    }
}
