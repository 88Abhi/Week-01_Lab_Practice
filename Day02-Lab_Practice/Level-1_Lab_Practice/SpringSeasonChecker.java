// Create a class named SpringSeasonChecker to determine if the given month and day fall within the spring season.
import java.util.Scanner;

class SpringSeasonChecker 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for month and day.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the month as an integer (1-12).
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        // Prompt the user to input the day as an integer.
        System.out.print("Enter the day: ");
        int day = input.nextInt();

        // Check if the given month and day fall within the range of the spring season (March 20 to June 20).
        boolean isSpring = (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);

        // Display the result indicating whether it's spring season or not.
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
