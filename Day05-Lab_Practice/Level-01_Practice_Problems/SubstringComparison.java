// A class SubstringComparison to compare two substrings
import java.util.Scanner; 

class SubstringComparison 
{
    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) 
	{
		// Create a string to store substring 
        String substring = new String(); 
        for (int i = start; i < end; i++) {
            substring += text.charAt(i);
        }
        return substring;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) 
	{
        // Check if lengths are different if yes, strings cannot be equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters at each position
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
		// Create Scanner object for input
        Scanner sc = new Scanner(System.in); 

        // Prompt user for the main string
        System.out.print("Enter the string: ");
        String mainString = sc.next();

        // Prompt user for the start index of the substring
        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();

        // Prompt user for the end index of the substring
        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();

        // Create substring using charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(mainString, startIndex, endIndex);

        // Create substring using built-in substring() method
        String substringUsingBuiltIn = mainString.substring(startIndex, endIndex);

        // Compare substrings using charAt() method
        boolean charAtComparisonResult = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + charAtComparisonResult);

		// Close the Scanner object
        sc.close(); 
    }
}
