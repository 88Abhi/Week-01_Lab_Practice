// This program implements FizzBuzz. For multiples of 3, it prints "Fizz";
// for multiples of 5, it prints "Buzz"; and for multiples of both, it prints "FizzBuzz".

import java.util.Scanner;

class FizzBuzzFor 
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
            // Loop through numbers from 1 to the user-entered number.
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            // Inform the user if the input is not a positive integer.
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
