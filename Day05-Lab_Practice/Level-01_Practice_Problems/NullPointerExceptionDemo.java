// A program to demonstrate NullPointerException. 
import java.util.Scanner; 

class NullPointerExceptionDemo 
{
    // Method to generate NullPointerException
    public static void generateNullPointerException() 
	{
		// Initialize variable to null
        String text = null; 
		
        // Call a String method on null to generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() 
	{
		// Initialize variable to null
        String text = null; 
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("NullPointerException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle generic runtime exception
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        // Call the method to generate NullPointerException
        System.out.println("Generating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (Exception e) {
            System.out.println("Exception caught during generation: " + e.getMessage());
        }

        // Call the method to handle NullPointerException
        System.out.println("Handling NullPointerException:");
        handleNullPointerException();
    }
}
