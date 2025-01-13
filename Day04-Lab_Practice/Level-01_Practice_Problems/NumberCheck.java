// Class to check whether a number is positive, negative, or zero
import java.util.Scanner; 

public class NumberCheck 
{
    // Method to check if the number is positive, negative, or zero
    public static int checkNumberSign(int number) 
	{
        // Check if the number is negative
        if (number < 0) {
            return -1; 
        }
        // Check if the number is positive
        else if (number > 0) {
            return 1; 
        }
        // If neither, the number must be zero
        else {
            return 0; 
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is positive, negative, or zero: ");
        int number = sc.nextInt(); 

        // Call the method to check the sign of the number
        int result = checkNumberSign(number); 

        // Display the result according to the sign of the number
        if (result == -1) {
            System.out.println("The number " + number + " is negative.");
        } else if (result == 1) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
