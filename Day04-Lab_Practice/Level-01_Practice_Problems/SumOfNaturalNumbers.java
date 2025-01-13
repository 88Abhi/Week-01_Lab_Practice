// Class to calculate the sum of first N natural numbers
import java.util.Scanner; 

class SumOfNaturalNumbers 
{

    // Method to calculate the sum of the first N natural numbers
    public static int calculateSum(int n) 
	{
        // Initialize the sum variable to zero
        int sum = 0;
        // Use a loop to calculate the sum of natural numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        // Return the total sum
        return sum;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter a number (N) to calculate the sum of first N natural numbers: ");
        int n = sc.nextInt(); 

        // Call the method to calculate the sum of first N natural numbers
        int sum = calculateSum(n); 

        // Display the result to the user
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close the Scanner object to release resources
        sc.close();
    }
}
