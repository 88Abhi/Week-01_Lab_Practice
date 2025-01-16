// Create a class to find the frequency of characters in a string using charAt() method
import java.util.Scanner;

class CharacterFrequency 
{
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) 
	{
        // Create an array to store the frequency of characters 
        int[] frequency = new int[256]; 

        // Loop through the text to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Create a temporary array to store unique characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Loop through the frequency array 
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); 
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }

        // Return the result array
        return result;
    }

    // Method to display the characters and their frequencies
    public static void displayFrequencies(String[][] frequencies) 
	{
        // Print table headers
        System.out.println("Character" + "\t" + "Frequency");

        // Loop through the result array to display each character and its frequency
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

        // Call the method to find the character frequencies
        String[][] frequencies = findCharacterFrequencies(inputText);

        // Display the character frequencies
        displayFrequencies(frequencies);

        // Close the scanner object
        sc.close();
    }
}
