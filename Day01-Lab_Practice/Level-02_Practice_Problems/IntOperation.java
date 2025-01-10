// Create a class named IntOperation to perform various integer operations
// and display the results to understand operator precedence.
import java.util.Scanner;

class IntOperation 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take user inputs from the keyboard.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input three integers (a, b, c) and 
        // store them in variables.
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        // Perform the operation a + b * c, following 
        // operator precedence (multiplication first).
        int result1 = a + b * c;

        // Perform the operation a * b + c, following 
        // operator precedence (multiplication first).
        int result2 = a * b + c;

        // Perform the operation c + a / b, following 
        // operator precedence (division first).
        int result3 = c + a / b;

        // Perform the operation a % b + c, evaluating 
        // modulus and addition.
        int result4 = a % b + c;

        // Display the results of all operations.
        System.out.println("The results of Integer Operations are " +
                           + result1 + ", " + result2 + ", " + result3 + 
                           " and " + result4);

        // Close the Scanner object to release resources.
        input.close();
    }
}