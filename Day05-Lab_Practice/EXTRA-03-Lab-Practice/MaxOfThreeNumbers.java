import java.util.Scanner; 

public class MaxOfThreeNumbers 
{

    // Method to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) 
	{
        return Math.max(a, Math.max(b, c)); // Use Math.max for comparison
    }

    // Method to take integer input from the user
    public static int takeInput(Scanner sc, String prompt)
	{
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take three inputs from the user
        int num1 = takeInput(sc, "Enter the first number: ");
        int num2 = takeInput(sc, "Enter the second number: ");
        int num3 = takeInput(sc, "Enter the third number: ");

        // Find the maximum of the three numbers
        int max = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);

        sc.close(); // Close the scanner
    }
}
