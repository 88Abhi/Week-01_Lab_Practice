import java.util.Scanner;

public class BasicCalculator 
{

    // Functions for basic mathematical operations
    public static int add(int a, int b) 
	{
        return a + b;
    }

    public static int subtract(int a, int b) 
	{
        return a - b;
    }

    public static int multiply(int a, int b) 
	{
        return a * b;
    }

    public static double divide(int a, int b) 
	{
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input: Numbers and operation choice
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Choose operation (1) Add (2) Subtract (3) Multiply (4) Divide: ");
        int choice = sc.nextInt();

        // Perform operation and display result
        try {
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
