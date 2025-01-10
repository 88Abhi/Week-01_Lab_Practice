// Create a class named DoubleOperation to perform arithmetic operations
// on double values and display the results with proper formatting.
import java.util.Scanner;

class DoubleOperation 
{
    public static void main(String[] args) 
  {
        // Create a Scanner object to take user inputs for double values.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input three double values (a, b, c) and 
		// store them in variables.
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Perform the operation a + b * c and store the result in result1.
        double result1 = a + b * c;

        // Perform the operation a * b + c and store the result in result2.
        double result2 = a * b + c;

        // Perform the operation c + a / b and store the result in result3.
        double result3 = c + a / b;

        // Display the results of all operations.
        System.out.println("The results of Integer Operations are " +
                           + result1 + ", " + result2 + " and " + result3);
        // Close the Scanner object to release resources.
        input.close();
    }
}
