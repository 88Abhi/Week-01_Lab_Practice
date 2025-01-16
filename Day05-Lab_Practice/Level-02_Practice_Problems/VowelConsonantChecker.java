// Class VowelConsonantChecker to find vowels and consonants in a string
import java.util.Scanner;

class VowelConsonantChecker {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacterType(char ch) 
	{
        // Convert character to lowercase
        ch = Character.toLowerCase(ch);

        // Check if character is a vowel
        if ("aeiou".indexOf(ch) != -1) {
            return "Vowel";
        } 
        // Check if character is a consonant
        else if (Character.isLetter(ch)) {
            return "Consonant";
        } 
        // If it's not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to check and display the character type
    public static String[][] getCharacterTypes(String text) 
	{
        // Create a 2D array to store the character and its type
        String[][] charTypes = new String[text.length()][2];

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Get the character
            char ch = text.charAt(i);

            // Store the character and its type in the 2D array
            charTypes[i][0] = String.valueOf(ch);
            charTypes[i][1] = checkCharacterType(ch);
        }

        // Return the 2D array of character types
        return charTypes;
    }

    // Method to display the character and its type in a tabular format
    public static void displayCharacterTypes(String[][] charTypes) 
	{
        // Print the table header
        System.out.printf("%-15s%-15s\n", "Character", "Type");

        // Print each character and its type
        for (String[] charInfo : charTypes) {
            System.out.printf("%-15s%-15s\n", charInfo[0], charInfo[1]);
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get the character types for each character in the string
        String[][] charTypes = getCharacterTypes(text);

        // Display the character types in a tabular format
        displayCharacterTypes(charTypes);

        // Close the Scanner object
        sc.close();
    }
}
