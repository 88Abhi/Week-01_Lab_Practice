// Create a class named CountdownFor to perform a countdown from the given number to 1 using a for loop.
import java.util.Scanner;

class CountdownFor 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the countdown start number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the starting value for the countdown.
        System.out.print("Enter the starting number for the countdown: ");
        int start = input.nextInt();

        // Use a for loop to decrement the counter and print each value.
        for (int counter = start; counter >= 1; counter--) {
            // Print the current value of the counter.
            System.out.println(counter);
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
