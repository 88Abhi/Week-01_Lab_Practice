// Create a class named ConvertDistance to convert kilometers to miles
// by taking user input
import java.util.Scanner;

class ConvertDistance 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
		 
        // Convert kilometers to miles using the formula (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + 
                           " miles for the given " + km + " km");
    }
}