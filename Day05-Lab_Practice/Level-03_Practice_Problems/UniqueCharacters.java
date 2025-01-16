// Create a class to find unique characters in a string using charAt()
import java.util.Scanner;

class UniqueCharacters 
{
    // Method to find the length of the string 
    public static int getStringLength(String text) 
	{
        // Initialize a counter to keep track of the length
        int length = 0;
        // Use a try-catch block to count characters until an exception occurs
        try {
            while (true) {
                // Access the character at the current index 
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception is thrown indicating the end of the string
        }
        // Return the calculated length
        return length;
    }

    // Method to find unique characters in the string
    public static char[] findUniqueCharacters(String text) 
	{
        // Get the length of the string using the custom getStringLength method
        int length = getStringLength(text);

        // Create an array to store unique characters
        char[] uniqueChars = new char[length];
		
        // Initialize a variable to count the unique characters
        int uniqueCount = 0;

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            // Flag to check if the current character is unique
            boolean isUnique = true;

            // Inner loop to compare the current character with all previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters without extra space
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        // Return the array of unique characters
        return result;
    }

    public static void main(String[] args) 
	{
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call the method to find unique characters and store the result
        char[] uniqueCharacters = findUniqueCharacters(inputText);

        // Display the unique characters
        System.out.print("Unique characters in the string: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        // Close the scanner object
        sc.close();
    }
}
