import java.util.Scanner;

// Create a class CountVowelsConsonants to count the vowels and Consonants 

class CountVowelsConsonants 
{

    // Method to count vowels and consonants in a string.
    public static int[] countVowelsAndConsonants(String text) 
	{
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase for case-insensitive comparison
        text = text.toLowerCase();

        // Iterate through each character in the string
        for (char ch : text.toCharArray()) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }

        // Return the counts as an array
        return new int[]{vowelsCount, consonantsCount};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the results
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        // Close the Scanner object
        sc.close();
    }
}
