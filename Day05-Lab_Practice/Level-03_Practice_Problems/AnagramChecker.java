// Create a class AnagramChecker to find the Body Mass Index of all the persons in a team
import java.util.Scanner;

class AnagramChecker 
{
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) 
	{
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters in the first text
        int[] frequency1 = new int[256]; 
		
        // Create an array to store the frequency of characters in the second text
        int[] frequency2 = new int[256];

        // Loop through the first text to find the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Loop through the second text to find the frequency of each character
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays of the two texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
				// Return false if the frequencies do not match
                return false; 
            }
        }

        // Return true if all the conditions are true
        return true;
    }

    public static void main(String[] args) 
	{
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first text
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        // Prompt the user to enter the second text
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the two texts are anagrams 
        boolean result = areAnagrams(text1, text2);

        // Display the result to the user
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        // Close the Scanner object
        sc.close();
    }
}
