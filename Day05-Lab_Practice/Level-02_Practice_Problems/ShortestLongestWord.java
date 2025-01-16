// Class ShortestLongestWord to split text and find shortest and longest words
import java.util.Scanner;

class ShortestLongestWord 
{
    // Method to split the text into words using charAt()
    // without using split() method
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

    // Method to find the shortest and longest word from the array
    public static String[] findShortestAndLongest(String[] words) 
	{
        // Initialize shortest and longest word 
        String shortest = words[0];
        String longest = words[0];

        // Loop through each word to find the shortest and longest word
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            } 
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Return the shortest and longest words as a 1D array
        return new String[]{shortest, longest};
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

        // Find the shortest and longest word
        String[] shortestLongest = findShortestAndLongest(words);

        // Display the shortest and longest words
        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        // Close the Scanner
        sc.close();
    }
}
