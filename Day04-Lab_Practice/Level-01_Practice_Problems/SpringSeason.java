// Class to check whether the given date falls in the Spring season
import java.util.Scanner; 

class SpringSeason 
{
    // Method to check if the given date falls in the Spring season
    public static boolean isSpringSeason(int month, int day) 
	{
        // Spring season is from March 20 to June 20
        if ((month == 3 && day >= 20) ||    // March 20 and onwards
            (month > 3 && month < 6) ||     // Entire April and May
            (month == 6 && day <= 20)) {    // Up to June 20
			
            return true; // Return true if the date falls in Spring
        }
        return false; // Return false otherwise
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the month as an integer
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt(); 

        // Prompt the user to enter the day of the month
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt(); 

        // Call the method to check if the given date is in the Spring season
        boolean isSpring = isSpringSeason(month, day); 

        // Display the result to the user
        if (isSpring) {
            System.out.println("It's a Spring Season!");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
