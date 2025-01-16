import java.util.Scanner;

class LongestWord 
{

    // Method to find the longest word in a sentence.
    
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using spaces
        String[] words = sentence.split(" ");

        // Initialize variables to keep track of the longest word
        String longestWord = "";
        int maxLength = 0;

        // Iterate through each word
        for (String word : words) {
            // Check if the current word is longer than the previously recorded longest
            if (word.length() > maxLength) {
                longestWord = word; // Update the longest word
                maxLength = word.length(); // Update the length
            }
        }

        // Return the longest word
        return longestWord;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the result
        System.out.println("The longest word is: " + longestWord);

        // Close the Scanner object
        sc.close();
    }
}
