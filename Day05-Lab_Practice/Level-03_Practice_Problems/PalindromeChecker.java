import java.util.Scanner;

class PalindromeChecker 
{
    // Method 1: Check palindrome by comparing characters from start and end
    public static boolean isPalindromeLogic1(String text) 
	{
        // Initialize start and end indexes
        int start = 0;
        int end = text.length() - 1;

        // Loop until the start index is less than the end index
        while (start < end) {
            // Compare characters at start and end
            if (text.charAt(start) != text.charAt(end)) {
                return false; 
            }
            // Move start and end indexes
            start++;
            end--;
        }
		// Return true if no mismatch is found
        return true; 
    }

    // Method 2: Recursive approach to check if text is a palindrome
    public static boolean isPalindromeLogic2(String text, int start, int end) 
	{	
        // Base case: If start index is greater than or equal to end index
        if (start >= end) {
            return true;
        }
        // Check if characters at start and end are not equal
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive call with updated start and end indexes
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Method to reverse a string using charAt()
    public static String reverseString(String text) 
	{
        // Create a StringBuilder to store the reversed text
        StringBuilder reversed = new StringBuilder();

        // Loop through the text from the end to the start
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i)); 
        }
		// Return the reversed text
        return reversed.toString(); 
    }

    // Method 3: Check palindrome by comparing the original and reversed text
    public static boolean isPalindromeLogic3(String text) 
	{
        // Convert the original text to a character array
        char[] originalArray = text.toCharArray();
		
        // Create a reversed string using the reverseString method
        String reversedText = reverseString(text);
		
        // Convert the reversed text to a character array
        char[] reversedArray = reversedText.toCharArray();

        // Compare each character in the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; 
            }
        }
		// Return true if all characters match
        return true; 
    }

    public static void main(String[] args) 
	{
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Check palindrome using Logic 1
        boolean resultLogic1 = isPalindromeLogic1(text);
        System.out.println("Palindrome check using Logic 1: " + (resultLogic1 ? "Yes" : "No"));

        // Check palindrome using Logic 2
        boolean resultLogic2 = isPalindromeLogic2(text, 0, text.length() - 1);
        System.out.println("Palindrome check using Logic 2: " + (resultLogic2 ? "Yes" : "No"));

        // Check palindrome using Logic 3
        boolean resultLogic3 = isPalindromeLogic3(text);
        System.out.println("Palindrome check using Logic 3: " + (resultLogic3 ? "Yes" : "No"));

        // Close the Scanner object
        sc.close();
    }
}
