// Class StringLengthFinder to find the length of a string without using the length() method
import java.util.Scanner;

class StringLengthFinder
{
    // Method to calculate the length of a string without using the length() method
    public static int findStringLength(String text) 
	{
        // Variable to store the length of the string
        int count = 0;

        // Try block to handle index out-of-bounds exception
        try {
            // Loop through the string
            while (true) {
                text.charAt(count);

                // Increment the count for every character found
                count++;
            }
        } 
        // Catch block to handle when the index is out of bounds
        catch (IndexOutOfBoundsException e) {
            // Do nothing as exception marks the end of the string
        }

        // Return the final count 
        return count;
    }

    // Main method to handle user input and display results
    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method to find the string length 
        int calculatedLength = findStringLength(text);

        // Use the built-in length() method for comparison
        int actualLength = text.length();

        // Display the string length calculated by the custom method
        System.out.println("Calculated length using custom method: " + calculatedLength);

        // Display the string length using the built-in method
        System.out.println("Actual length using built-in method: " + actualLength);

        // Close the Scanner object
        sc.close();
    }
}
