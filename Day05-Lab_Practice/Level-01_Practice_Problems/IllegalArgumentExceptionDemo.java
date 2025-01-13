// A program to demonstrate NumberFormatException
import java.util.Scanner; 

class IllegalArgumentExceptionDemo 
{
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) 
	{
        // Set start index greater than end index in substring to generate IllegalArgumentException
        System.out.println(text.substring(text.length() - 1, 0));
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) 
	{
        try {
            // Set start index greater than end index in substring
            System.out.println(text.substring(text.length() - 1, 0));
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("IllegalArgumentException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle generic runtime exception
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
		// Create Scanner object for input
        Scanner sc = new Scanner(System.in); 

        // Prompt user for string input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call the method to generate IllegalArgumentException
        System.out.println("Generating IllegalArgumentException:");
        try {
            generateIllegalArgumentException(userInput);
        } catch (Exception e) {
            System.out.println("Exception caught during generation: " + e.getMessage());
        }

        // Call the method to handle IllegalArgumentException
        System.out.println("Handling IllegalArgumentException:");
        handleIllegalArgumentException(userInput);

		// Close the Scanner object
        sc.close(); 
    }
}
