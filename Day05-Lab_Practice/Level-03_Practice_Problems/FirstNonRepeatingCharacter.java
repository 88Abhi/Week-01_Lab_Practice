// Create a class to find the first non-repeating character in a string
import java.util.Scanner;

class FirstNonRepeatingCharacter 
{
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) 
	{
        // Create an array to store the frequency of each character
        int[] frequency = new int[256];

        // Loop through the text to calculate the frequency 
        for (int i = 0; i < text.length(); i++) { 
            frequency[text.charAt(i)]++;
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            // Check if the frequency of the current character is 1
            if (frequency[text.charAt(i)] == 1) {
                // Return the first non-repeating character
                return text.charAt(i);
            }
        }

        // If no non-repeating character is found, return a Null character
        return '\0'; 
    }
    
	public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Check and display the result
        if (result != '\0') {
            // Display the first non-repeating character
            System.out.println("The first non-repeating character is: " + result);
        } else {
            // Display a message if no non-repeating character exists
            System.out.println("No non-repeating character found in the string.");
        }

        // Close the scanner object
        sc.close();
    }
}
