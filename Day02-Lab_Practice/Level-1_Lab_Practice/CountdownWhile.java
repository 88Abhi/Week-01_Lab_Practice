// Create a class named CountdownWhile to perform a countdown from the given number to 1 using a while loop.
import java.util.Scanner;

class CountdownWhile 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the countdown start number.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the starting value for the countdown.
        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();

        // Use a while loop to decrement the counter and print each value.
        while (counter >= 1) {
            // Print the current value of the counter.
            System.out.println(counter);

            // Decrement the counter by 1.
            counter--;
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
