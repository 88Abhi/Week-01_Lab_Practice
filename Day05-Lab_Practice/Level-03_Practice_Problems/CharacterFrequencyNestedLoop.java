// Create a class to find the frequency of characters in a string using nested loops
import java.util.Scanner;

class CharacterFrequencyNestedLoop
{
    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequencies(String text) 
	{
        // Convert the string to a character array
        char[] charArray = text.toCharArray();
        
        // Create an array to store the frequency of each character
        int[] frequencyArray = new int[charArray.length];
        
        // Initialize all characters frequency to -1
        for (int i = 0; i < charArray.length; i++) {
            frequencyArray[i] = -1;
        }

        // Nested loops to calculate the frequency of characters
        for (int i = 0; i < charArray.length; i++) {
            if (frequencyArray[i] == -1) {
                // Initialize frequency count to 1
				int count = 1; 

                for (int j = i + 1; j < charArray.length; j++) {
                    // Increment count for duplicate characters
					if (charArray[i] == charArray[j]) {
                        count++; 
                        frequencyArray[j] = 0; 
                    }
                }

                // Store the frequency of the character
                frequencyArray[i] = count;
            }
        }

        // Create a 1D String array to store the characters and their frequencies
        String[] resultArray = new String[charArray.length];
        int resultIndex = 0;

        // Store the result array with characters and their frequencies
        for (int i = 0; i < charArray.length; i++) {
            if (frequencyArray[i] > 0) { 
                resultArray[resultIndex++] = charArray[i] + ": " + frequencyArray[i];
            }
        }

        // Return the result array trimmed to the actual size
        String[] trimmedResult = new String[resultIndex];
        System.arraycopy(resultArray, 0, trimmedResult, 0, resultIndex);

        return trimmedResult;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequencies(inputText);

        // Display the frequencies of the characters
        System.out.println("Character frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

        // Close the scanner object
        sc.close();
    }
}
