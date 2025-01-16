// Class StringSplitter to split text into words and compare with split() method
import java.util.Scanner;

class StringSplitter 
{
    // Method to split the string into words using charAt()
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
            // Check for space or end of string to extract a word
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

    // Method to compare the two string arrays (using charAt() and split() method)
    public static boolean compareWordArrays(String[] array1, String[] array2) 
	{
        // If the lengths of the arrays are not equal, return false
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each word in the arrays
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        // Return true if both arrays are identical
        return true;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Use the custom method to split the text into words
        String[] wordsUsingCharAt = splitTextIntoWords(text);

        // Use the built-in split() method for comparison
        String[] wordsUsingSplit = text.split(" ");

        // Display the comparison result 
        boolean areArraysIdentical = compareWordArrays(wordsUsingCharAt, wordsUsingSplit);
        System.out.println("Are both arrays identical? " + areArraysIdentical);

        // Close the Scanner object
        sc.close();
    }
}
