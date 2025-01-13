// Class to find the smallest and largest numbers among three input.
import java.util.Scanner; 

class SmallestAndLargest 
{
    // Method to find the smallest and largest numbers among three inputs
    public static int[] findSmallestAndLargest(int number1,
                                	           int number2, int number3) {
        // Initialize the smallest and largest variables
		// Find the smallest of the three
        int smallest = Math.min(number1, Math.min(number2, number3));

		// Find the largest of the three
        int largest = Math.max(number1, Math.max(number2, number3)); 

        // Return the results as an array
        return new int[]{smallest, largest}; 
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt(); 

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt(); 

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt(); 

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3); 

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0] + 
                           " and the largest number is: " + result[1]);

        // Close the Scanner object to release resources
        sc.close();
    }
}
