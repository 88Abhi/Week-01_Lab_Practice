import java.util.Scanner;

class RemoveDuplicates  
{

    // Method to remove all duplicate characters from a string.
    // return The string after removing duplicates.
    public static String removeDuplicates(String text) 
	{
        // Use a result to store unique characters
        String result = "";

        // Iterate through the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is not already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result += (currentChar); // Add unique character
            }
        }

        // Return the string with duplicates removed
        return result;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to remove duplicates: ");
        String text = sc.nextLine();

        // Call the method to remove duplicates
        String uniqueString = removeDuplicates(text);

        // Display the result
        System.out.println("String after removing duplicates: " + uniqueString);

        // Close the Scanner object
        sc.close();
    }
}