// This class finds the youngest friend and the tallest friend among Amar, Akbar, and Anthony.
import java.util.Scanner;

class FriendsComparison 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input.
        Scanner input = new Scanner(System.in);

        // Declare arrays to store ages and heights of the three friends.
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Prompt the user to input ages and heights.
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            // Validate age input; it must be positive.
            if (ages[i] <= 0) {
                System.err.println("Invalid age. Please enter a positive number.");
                i--; // Decrement index to retry the input.
                continue;
            }

            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();

            // Validate height input; it must be positive.
            if (heights[i] <= 0) {
                System.err.println("Invalid height. Please enter a positive number.");
                i--; // Decrement index to retry the input.
            }
        }

        // Variables to track the youngest and tallest friends.
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and tallest friends.
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update youngest friend index.
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // Update tallest friend index.
            }
        }

        // Display the youngest and tallest friends.
        System.out.println("\nThe youngest friend is " + names[youngestIndex] +
                           " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex] +
                           " with height " + heights[tallestIndex] + " cm.");

        // Close the Scanner object to release resources.
        input.close();
    }
}
