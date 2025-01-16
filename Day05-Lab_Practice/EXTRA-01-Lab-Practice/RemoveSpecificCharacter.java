import java.util.Scanner;

class RemoveSpecificCharacter 
{

    // Method to remove all occurrences of a specific character from a string.
    public static String removeCharacter(String text, char ch) 
	{
        // Use a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char currentChar : text.toCharArray()) {
            // Append the character only if it is not equal to the specified character
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        // Return the modified string
        return result.toString();
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Prompt the user to enter the character to remove
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        // Call the method to remove the character
        String modifiedString = removeCharacter(text, ch);

        // Display the result
        System.out.println("String after removing '" + ch + "': " + modifiedString);

        // Close the Scanner object
        sc.close();
    }
}
