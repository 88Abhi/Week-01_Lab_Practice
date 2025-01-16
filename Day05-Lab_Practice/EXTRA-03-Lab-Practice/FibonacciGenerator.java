import java.util.Scanner;

public class FibonacciGenerator 
{

    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) 
	{
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input: Number of terms
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Generate Fibonacci sequence
        generateFibonacci(terms);

        sc.close();
    }
}
