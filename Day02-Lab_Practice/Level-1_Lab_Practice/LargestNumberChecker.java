// This program determines which number among three user-inputted numbers is the largest.
import java.util.Scanner;

class LargestNumberChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Take three numbers as input from the user.
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if each number is the largest.
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Print the results indicating whether each number is the largest.
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner to release resources.
        input.close();
    }
}
