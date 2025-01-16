// Class StringTrimmer to trim the leading and trailing spaces 
import java.util.Scanner;

class StringTrimmer 
{
    // Method to find the start and end indexes for trimming leading and trailing spaces
    public static int[] findTrimIndexes(String text) 
	{
        // Initialize start and end indexes
        int start = 0, end = text.length() - 1;

        // Find the first non-space character from the start
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character from the end
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indexes in an array
        return new int[]{start, end};
    }

    // Method to create a substring with start and end indexes
    public static String createSubstring(String text, int start, int end) 
	{
        // Use StringBuilder to build the substring character by character
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) 
	{
        // Check if lengths are different; if so, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // Return true if all characters match
        return true;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Call the method to find trim indexes
        int[] indexes = findTrimIndexes(input);

        // Extract the substring without leading and trailing spaces
        String trimmedCustom = createSubstring(input, indexes[0], indexes[1]);

        // Use the built-in trim() method for comparison
        String trimmedBuiltIn = input.trim();

        // Compare the results using the custom method
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display the results
        System.out.println("Trimmed String using charAt(): " + trimmedCustom);
        System.out.println("Trimmed String using built-in trim(): " + trimmedBuiltIn);
        System.out.println("Are the two strings equal? " + isEqual);

        // Close the Scanner
        sc.close();
    }
}
