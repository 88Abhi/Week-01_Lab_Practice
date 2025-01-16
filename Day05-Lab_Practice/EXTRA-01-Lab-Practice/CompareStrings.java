import java.util.Scanner;

class CompareStrings 
{

    // Method to compare two strings lexicographically.

    public static String compareStringsLexicographically(String str1, String str2) 
	{
        // Compare the strings character by character
        int comparisonResult = 0;
        int length = Math.min(str1.length(), str2.length());
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                comparisonResult = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        // If comparisonResult is still 0, compare based on their lengths
        if (comparisonResult == 0) {
            comparisonResult = str1.length() - str2.length();
        }

        // Return a message based on the comparison
        if (comparisonResult < 0) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.";
        } else if (comparisonResult > 0) {
            return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.";
        } else {
            return "\"" + str1 + "\" is equal to \"" + str2 + "\".";
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Call the method to compare the strings
        String result = compareStringsLexicographically(str1, str2);

        // Display the result
        System.out.println(result);

        // Close the Scanner object
        sc.close();
    }
}
