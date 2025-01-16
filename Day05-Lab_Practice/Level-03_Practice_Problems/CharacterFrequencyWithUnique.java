// Create a class to find the frequency of characters in a string using unique characters
import java.util.Scanner;

class CharacterFrequencyWithUnique 
{
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) 
	{
        // Temporary array to hold unique characters
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        // Loop to find unique characters using nested loops
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the unique list
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the temporary array
            if (isUnique) {
                temp[uniqueCount++] = currentChar;
            }
        }

        // Create an array to store the exact unique characters
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(temp, 0, uniqueChars, 0, uniqueCount);

        // Return the unique characters
        return uniqueChars;
    }

    // Method to find the frequency of unique characters in the string
    public static String[][] findFrequencies(String text, char[] uniqueChars) 
	{
        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop to calculate the frequency of each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            int count = 0;

            // Count occurrences of the unique character in the string
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChar) {
                    count++;
                }
            }

            // Store the character and its frequency in the result array
            result[i][0] = Character.toString(uniqueChar);
            result[i][1] = Integer.toString(count);
        }

        // Return the frequency result
        return result;
    }

    // Method to display the character frequencies in a tabular format
    public static void displayFrequencies(String[][] frequencies) 
	{
        // Print table headers
        System.out.println("Character" + "\t" + "Frequency");

        // Loop to display each unique character and its frequency
        for (String[] row : frequencies) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Find the unique characters in the string
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Find the frequencies of the unique characters
        String[][] frequencies = findFrequencies(inputText, uniqueChars);

        // Display the frequencies of the unique characters
        displayFrequencies(frequencies);

        // Close the scanner object
        sc.close();
    }
}
