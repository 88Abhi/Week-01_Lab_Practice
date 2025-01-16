// Class VowelsAndConsonantsCounter to find vowels and consonants in a string
import java.util.Scanner;

class VowelsAndConsonantsCounter 
{
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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) 
	{
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Get the character 
            char ch = text.charAt(i);

            // Check if the character is a vowel or consonant
            if (checkCharacterType(ch).equals("Vowel")) {
                vowelCount++;
            } else if (checkCharacterType(ch).equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the vowel and consonant count as an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get the count of vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the results
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);

        // Close the Scanner 
        sc.close();
    }
}
