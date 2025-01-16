// Create a class CalendarDisplay to display a calendar for a given month and year
import java.util.Scanner;

class CalendarDisplay 
{
    // Method to get the name of the month
    public static String getMonthName(int month) 
	{
        // Array to store the names of the months
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
		// Return the month name for the given month
		return months[month - 1]; 
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
	{
        // Check for leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) 
	{
        // Array to store the number of days in each month
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
			// Return 29 for February in a leap year
            return 29; 
        }
		
		// Return the number of days for the given month
        return days[month - 1]; 
    }

    // Method to calculate the first day of the month using the Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) 
	{
        int y0 = year - (14 - month) / 12; 
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; 
        int m0 = month + 12 * ((14 - month) / 12) - 2; 
        return (1 + x + (31 * m0) / 12) % 7; 
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) 
	{
        // Get the name of the month and number of days
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("  " + monthName + "  " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Print spaces for the first day indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%5d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); 
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
		// Create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        // Prompt the user to enter the year
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        // Close the Scanner object
        sc.close();
    }
}
