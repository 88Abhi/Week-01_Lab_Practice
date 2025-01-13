// A program to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner; 

class StringIndexOutOfBoundsExceptionDemo 
{
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) 
	{
        // Access an index beyond the string's length to generate the exception
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) 
	{
        try {
            // Attempt to access an index beyond the string's length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle StringIndexOutOfBoundsException
            System.out.println("StringIndexOutOfBoundsException handled: " + e.getMessage());
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

        // Call the method to generate StringIndexOutOfBoundsException
        System.out.println("Generating StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(userInput);
        } catch (Exception e) {
            System.out.println("Exception caught during generation: " + e.getMessage());
        }

        // Call the method to handle StringIndexOutOfBoundsException
        System.out.println("Handling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(userInput);

		// Close the Scanner object
        sc.close(); 
    }
}

