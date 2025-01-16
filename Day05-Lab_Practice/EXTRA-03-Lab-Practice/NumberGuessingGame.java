import java.util.Scanner; 
import java.util.Random; 

public class NumberGuessingGame 
{

    // Method to generate a random guess between low and high
    public static int generateGuess(int low, int high) 
	{
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100; // Range for guessing
        boolean correctGuess = false;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it!");

        while (!correctGuess) {
            int guess = generateGuess(low, high);
            System.out.println("Computer's guess: " + guess);

            // Ask user for feedback
            System.out.print("Is the guess 'high', 'low', or 'correct'? ");
            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1; // Update high range
            } else if (feedback.equals("low")) {
                low = guess + 1; // Update low range
            } else if (feedback.equals("correct")) {
                System.out.println("The computer guessed your number correctly!");
                correctGuess = true;
            } else {
                System.out.println("Invalid input. Please respond with 'high', 'low', or 'correct'.");
            }
        }

        sc.close(); // Close the scanner
    }
}
