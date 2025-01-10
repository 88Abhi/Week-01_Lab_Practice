// Class to create a calculator using switch...case
import java.util.Scanner;

class Calculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get inputs for the first number, operator, and second number
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Perform the operation based on the input operator
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        // Close the Scanner object
        input.close();
    }
}
