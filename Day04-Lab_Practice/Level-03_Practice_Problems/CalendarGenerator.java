// Create a class CalendarGenerator to display a calendar for a given month and year
import java.util.Scanner;

public class CalendarGenerator 
{
    // Method to get the name of the month
    public static String getMonthName(int month) 
    {
        // Array to store the names of the months
        String[] months = {"January", "February", "March", "April", "May",         
                           "July", "August", "September",                   
                           "October", "November", "December"};
		
	  // Return the name of the month
        return months[month - 1]; 
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
    {
        // Leap year logic: Divisible by 4 but not 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) 
    {
        // Array to store the number of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 
                             31, 31, 30, 31, 30, 31};

        // If it's February and a leap year, return 29 days
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
	  // Return the number of days in the month
        return daysInMonth[month - 1]; 
    }

    // Method to calculate the first day of the month
    public static int getFirstDayOfMonth(int month, int year) 
    {
        int day = 1; 
        int y0 = year - (14 - month) / 12; 
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2; 
        return (day + x + (31 * m0) / 12) % 7; 
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) 
    {
        // Get the name of the month and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println(monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day); 
            if ((firstDay + day) % 7 == 0) { 
                System.out.println();
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the month and year
        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt(); 
		
        System.out.println("Enter the year:");
        int year = sc.nextInt(); 

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            // Display the calendar for the given month and year
            displayCalendar(month, year);
        }

        // Close the scanner
        sc.close();
    }
}