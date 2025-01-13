// A class LowerCaseComparison to convert the complete text to lowercase
import java.util.Scanner; 

class LowerCaseComparison 
{
    // Method to convert text to lowercase without using built-in methods
    public static String convertToLowerCase(String text) 
	{
		// To store the result
        String lowerCaseText = new String(); 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); 
            // If the character is uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            lowerCaseText += ch; 
        }
		// Return the resulting string
        return lowerCaseText;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String text1, String text2) 
	{
		// If lengths are different, strings are not equal
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
			// If characters at any index differ, strings are not equal
            if (text1.charAt(i) != text2.charAt(i)) {
                return false; 
            }
        }
		
		// Strings are equal
        return true; 
    }

    public static void main(String[] args) 
	{
		// Create Scanner object for input
        Scanner sc = new Scanner(System.in); 

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Convert the text to lowercase using a built-in method
        String lowerCaseBuiltIn = userInput.toLowerCase();

        // Convert the text to lowercase using the custom method
        String lowerCaseCustom = convertToLowerCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCustom);

        // Display the results
        System.out.println("Lowercase (Built-in Method): " + lowerCaseBuiltIn);
        System.out.println("Lowercase (Custom Method): " + lowerCaseCustom);
        System.out.println("Are both lowercase results equal? " + areEqual);
		
		// Close the Scanner object
        sc.close(); 
    }
}
