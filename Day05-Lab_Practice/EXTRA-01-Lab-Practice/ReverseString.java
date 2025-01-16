import java.util.Scanner;

class ReverseString 
{

    // Method to reverse a string without using built-in methods. 
    public static String reverseString(String text) 
	{
        // Use a StringBuilder to construct the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the string in reverse order
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        // Return the reversed string
        return reversed.toString();
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String text = sc.nextLine();

        // Call the method to reverse the string
        String reversed = reverseString(text);

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the Scanner object
        sc.close();
    }
}
