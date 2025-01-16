import java.util.Scanner;

class SubstringOccurrences 
{

    // Method to count the occurrences of a substring in a string.
    public static int countSubstringOccurrences(String text, String substring) 
	{
        int count = 0;
        int index = 0;

        // Use a loop to find all occurrences of the substring
        while ((index = text.indexOf(substring, index)) != -1) {
            count++; // Increment the count
            index += substring.length(); // Move the index forward
        }

        // Return the total count
        return count;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Prompt the user to enter the substring
        System.out.print("Enter a substring to find: ");
        String substring = sc.nextLine();

        // Call the method to count occurrences
        int count = countSubstringOccurrences(text, substring);

        // Display the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times.");

        // Close the Scanner object
        sc.close();
    }
}
