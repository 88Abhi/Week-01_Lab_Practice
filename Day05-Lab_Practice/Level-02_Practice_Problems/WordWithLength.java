// Class WordWithLength to split text into words and return their lengths in a 2D array
import java.util.Scanner;

class WordWithLength 
{
    // Method to split the text into words using charAt() method
	// without using built-in split()
    public static String[] splitTextIntoWords(String text) 
	{
        // Find number of spaces in the string to count words
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[spaceCount + 1];
        int wordStartIndex = 0;
        int wordEndIndex = 0;
        int wordIndex = 0;

        // Split the string based on spaces
        for (int i = 0; i <= text.length(); i++) {
            // Check for space or end of string 
            if (i == text.length() || text.charAt(i) == ' ') {
                wordEndIndex = i;
                words[wordIndex] = text.substring(wordStartIndex, wordEndIndex);
                wordIndex++;
                wordStartIndex = i + 1;
            }
        }

        // Return the words array
        return words;
    }

    // Method to create a 2D array of words with their lengths
    public static String[][] getWordsAndLengths(String[] words) 
	{
        // Create a 2D array to store the words and their lengths
        String[][] wordsWithLength = new String[words.length][2];

        // Loop through each word to calculate and store the word and its length
        for (int i = 0; i < words.length; i++) {
            wordsWithLength[i][0] = words[i];  
            wordsWithLength[i][1] = String.valueOf(words[i].length()); 
        }

        // Return the 2D array of words and lengths
        return wordsWithLength;
    }

    // Method to display the 2D array in a tabular format
    public static void displayWordsAndLengths(String[][] wordsWithLength) 
	{
        // Print the table header
        System.out.println("Word" + "\t\t" + "Length");

        // Print each word and its length
        for (String[] wordInfo : wordsWithLength) {
            System.out.println(wordInfo[0] + "\t\t" + wordInfo[1]);
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Use the custom method to split the text into words
        String[] words = splitTextIntoWords(text);

        // Get the words and their corresponding lengths
        String[][] wordsWithLength = getWordsAndLengths(words);

        // Display the words with their lengths in a tabular format
        displayWordsAndLengths(wordsWithLength);

        // Close the Scanner 
        sc.close();
    }
}
