// Program to find the frequency of each digit in a given number.
import java.util.Scanner;

public class DigitFrequency 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take the input for the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Loop through each digit of the number
        while (number > 0) {
            int digit = (int)(number % 10); // Get the last digit
            frequency[digit]++; // Increase the frequency for this digit
            number /= 10; // Remove the last digit from the number
        }
        
        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) 
		{
            if (frequency[i] > 0) 
			{
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}