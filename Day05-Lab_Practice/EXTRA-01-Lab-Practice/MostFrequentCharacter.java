import java.util.HashMap;
import java.util.Scanner;

class MostFrequentCharacter 
{

    // Method to find the most frequent character in a string.
    public static char findMostFrequentCharacter(String text) 
	{
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : text.toCharArray()) {
            // Increment the frequency of the character in the map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the highest frequency
        char mostFrequent = '\0';
        int maxFrequency = 0;

        for (char key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (frequency > maxFrequency) {
                mostFrequent = key;
                maxFrequency = frequency;
            }
        }

        // Return the most frequent character
        return mostFrequent;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to find the most frequent character: ");
        String text = sc.nextLine();

        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(text);

        // Display the result
        System.out.println("The most frequent character is: '" + mostFrequentChar + "'");

        // Close the Scanner object
        sc.close();
    }
}
