// class StringComparison to compare strings
import java.util.Scanner; 

class StringComparison 
{
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) 
	{
        // Check if lengths are different; if yes, strings cannot be equal
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

        // Prompt user for the first string
        System.out.print("Enter the first string: ");
        String string1 = sc.next();

        // Prompt user for the second string
        System.out.print("Enter the second string: ");
        String string2 = sc.next();

        // Compare strings using charAt() method
        boolean charAtComparisonResult = compareStringsUsingCharAt(string1, string2);

        // Compare strings using built-in equals() method
        boolean builtInComparisonResult = string1.equals(string2);

        // Display the results
        System.out.println("Comparison using charAt(): " + charAtComparisonResult);
        System.out.println("Comparison using equals(): " + builtInComparisonResult);

        // Check if the results of both methods match
        System.out.println("Do both methods produce the same result? " + (charAtComparisonResult == builtInComparisonResult));
		
		// Close the Scanner object
        sc.close(); 
    }
}
