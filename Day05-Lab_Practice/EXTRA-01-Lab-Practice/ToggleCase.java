import java.util.Scanner;

class ToggleCase 
{

    // Method to toggle the case of each character in a string.
    public static String toggleCase(String text) 
	{
        // Use a StringBuilder to build the toggled string
        StringBuilder toggledString = new StringBuilder();

        // Iterate through each character
        for (char ch : text.toCharArray()) {
            // Check if the character is uppercase, then convert to lowercase
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            }
            // Check if the character is lowercase, then convert to uppercase
            else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            }
            // Append the character as is (non-alphabetic characters)
            else {
                toggledString.append(ch);
            }
        }

        // Return the toggled string
        return toggledString.toString();
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to toggle case: ");
        String text = sc.nextLine();

        // Call the method to toggle case
        String toggledString = toggleCase(text);

        // Display the result
        System.out.println("Toggled case string: " + toggledString);

        // Close the Scanner object
        sc.close();
    }
}
