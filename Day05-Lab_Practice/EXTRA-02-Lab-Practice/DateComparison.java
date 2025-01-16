import java.time.LocalDate; // Import LocalDate class
import java.util.Scanner; // Import Scanner for user input

public class DateComparison 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Prompt user for the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput);

        // Prompt user for the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Compare the dates and print the result
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }

        // Close the scanner
        sc.close();
    }
}
