// This program implements FizzBuzz using a while loop.
// For multiples of 3, it prints "Fizz"; for multiples of 5, it prints "Buzz";
// and for multiples of both, it prints "FizzBuzz".

import java.util.Scanner;

class FizzBuzzWhile 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for the range.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer.
        if (number > 0) {
            int i = 1; // Initialize the counter for the while loop.
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Increment the counter.
            }
        } else {
            // Inform the user if the input is not a positive integer.
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
