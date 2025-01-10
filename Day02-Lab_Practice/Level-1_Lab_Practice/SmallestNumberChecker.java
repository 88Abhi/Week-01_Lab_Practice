// Create a class named SmallestNumberChecker to determine if the first number is the smallest of three numbers.
import java.util.Scanner;

class SmallestNumberChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for three numbers.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input three numbers and store them in variables.
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest.
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display the result with a descriptive message.
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the Scanner object to release resources.
        input.close();
    }
}
