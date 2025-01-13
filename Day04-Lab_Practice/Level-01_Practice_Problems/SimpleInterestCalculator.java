// Importing Scanner class for user input
import java.util.Scanner; 

// Class to calculate Simple Interest using methods
public class SimpleInterestCalculator 
{
    // Method to calculate the Simple Interest
    public static double getSimpleInterest(double principal, double rate,                            
                                           double time) 
    {
        // Formula to calculate Simple Interest: Principal * Rate * Time / 100
		double interest = (principal * rate * time) / 100;
		
		// Return the calculated Simple Interest
        return  interest;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble(); 

        // Prompt the user to enter the Rate of interest
        System.out.print("Enter the Rate of interest (in %): ");
        double rate = sc.nextDouble(); 

        // Prompt the user to enter the Time duration
        System.out.print("Enter the Time duration (in years): ");
        double time = sc.nextDouble(); 

        // Call the method to calculate Simple Interest and store the result
        double simpleInterest = getSimpleInterest(principal, rate, time); 

        // Display the Simple Interest along with the input details
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           "% and Time " + time);

        // Close the Scanner object to release resources
        sc.close();
    }
}

