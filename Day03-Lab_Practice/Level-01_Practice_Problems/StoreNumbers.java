// StoreNumbers Class stores user-entered numbers in an array until the user enters 
// a 0, a negative number, or the array limit (10 numbers) is reached.
import java.util.Scanner;

class StoreNumbers 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Declare an array to store up to 10 numbers. 
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        // Continuously take user input until criteria are met. 
        // Stop when 0, a negative number, or the array limit is reached.
        System.out.println("Enter numbers (stop with 0 or negative):");
        while (true) {
            double num = input.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index] = num;
            index++;
        }

        // Calculate the sum of all stored numbers. 
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the stored numbers and their total sum. 
        System.out.println("Stored numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);

        // Close the Scanner object to free resources. 
        input.close();
    }
}
