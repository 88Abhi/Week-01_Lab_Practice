// Create a class named QuotientRemainder to calculate the quotient and remainder
// when dividing two numbers provided by the user.
import java.util.Scanner;

class QuotientRemainder 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs from the keyboard.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number (dividend) and read the input.
        System.out.print("Enter the first number (dividend): ");
        int number1 = input.nextInt();

        // Prompt the user to enter the second number (divisor) and read the input.
        System.out.print("Enter the second number (divisor): ");
        int number2 = input.nextInt();

        // Calculate the quotient using the division operator (/) 
        // and store it in a variable named quotient.
        int quotient = number1 / number2;

        // Calculate the remainder using the modulus operator (%)
        // and store it in a variable named remainder.
        int remainder = number1 % number2;

        // Display the calculated quotient and remainder with a descriptive message.
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder +
                           " for the numbers " + number1 + " and " + number2);

        // Close the Scanner object to release resources and avoid memory leaks.
        input.close();
    }
}
