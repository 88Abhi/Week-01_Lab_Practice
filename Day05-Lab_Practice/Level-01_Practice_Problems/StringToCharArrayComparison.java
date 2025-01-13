// Create a class StringToCharArrayComparison to compare string with char array
import java.util.Scanner; 

class StringToCharArrayComparison 
{
    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharactersFromString(String text) 
	{
        // Create a character array of the same length as the string
        char[] charArray = new char[text.length()];

        // Loop through each character in the string and store it in the array
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i); 
        }

        // Return the character array
        return charArray;
    }

    // Method to compare two character arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) 
	{
        // Check if lengths of both arrays are different if yes, arrays cannot be equal
        if (array1.length != array2.length) {
            return false;
        }

        // Loop through both arrays and compare characters at each index
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
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

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.next(); 

        // Get characters using user-defined method
        char[] userDefinedCharArray = getCharactersFromString(inputString);

        // Get characters using built-in toCharArray() method
        char[] builtInCharArray = inputString.toCharArray();

        // Compare the results of both methods
        boolean areArraysEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);

        // Display the results
        System.out.println("Characters using user-defined method: ");
        for (char c : userDefinedCharArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using built-in toCharArray() method: ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }

        // Display the comparison result
        System.out.println("\nAre both character arrays equal? " + areArraysEqual);

		// Close the Scanner object
        sc.close(); 
    }
}
