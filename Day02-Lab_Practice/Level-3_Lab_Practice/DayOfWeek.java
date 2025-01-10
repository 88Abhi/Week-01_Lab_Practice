// Class to calculate the day of the week from a given date
import java.util.Scanner;

class DayOfWeek 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get inputs for day, month, and year
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Calculate intermediate values
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        // Print the day of the week
        System.out.println("The day of the week is: " + d0);

        // Close the Scanner object
        input.close();
    }
}
