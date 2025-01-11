// MultiplicationTable Class generates a multiplication table for a user-specified number.
import java.util.Scanner;

class MultiplicationTable 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number. 
        // This number will be used to generate the table.
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        // Declare an array to store multiplication results. 
        int[] table = new int[10];

        // Calculate the multiplication table using a loop. 
        // Store each result in the respective array index.
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table. 
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + table[i - 1]);
        }

        // Close the Scanner object to free resources.
        input.close();
    }
}
