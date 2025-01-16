import java.util.Scanner;

public class FactorialRecursion 
{

    // Recursive function to calculate factorial
    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input: Number for factorial calculation
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate and display factorial
        System.out.println("Factorial of " + number + " is: " + calculateFactorial(number));

        sc.close();
    }
}
