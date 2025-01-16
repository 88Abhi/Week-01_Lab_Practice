import java.util.Scanner;

class ReplaceWordInSentence 
{

    // Method to replace a word in a given sentence with another word.
    public static String replaceWord(String sentence, String oldWord, String newWord) 
	{
        // Check if the old word exists in the sentence
        if (!sentence.contains(oldWord)) {
            return "The word \"" + oldWord + "\" does not exist in the sentence.";
        }

        // Replace all occurrences of the old word with the new word
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Prompt the user to enter the word to replace
        System.out.print("Enter the word to be replaced: ");
        String oldWord = sc.next();

        // Prompt the user to enter the new word
        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Call the method to replace the word
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the result
        System.out.println("Modified Sentence: " + modifiedSentence);

        // Close the Scanner object
        sc.close();
    }
}
