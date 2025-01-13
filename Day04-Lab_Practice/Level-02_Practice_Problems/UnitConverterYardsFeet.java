
// Utility class to perform unit conversions for yards, feet, meters, and inches
import java.util.Scanner;

class UnitConverterYardsFeet 
{
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) 
    {
        // Conversion factor for yards to feet
        double yards2feet = 3;

        // Perform and return the conversion
        double feet = yards * yards2feet;
        return feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) 
    {
        // Conversion factor for feet to yards
        double feet2yards = 0.333333;

        // Perform and return the conversion
        double yards = feet * feet2yards;
        return yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) 
    {
        // Conversion factor for meters to inches
        double meters2inches = 39.3701;

        // Perform and return the conversion
        double inches = meters * meters2inches;
        return inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) 
    {
        // Conversion factor for inches to meters
        double inches2meters = 0.0254;
        // Perform and return the conversion
        double meters = inches * inches2meters;
        return meters;
    }
	
	// Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) 
	{
        // Conversion factor for inches to centimeters
        double inches2cm = 2.54;
		
		// Perform and return the conversion
		double cm = inches * inches2cm;
        return cm;
    }
	
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to select a conversion type
        System.out.println("Select a conversion type:" + "\n1. Yards to Feet" + 
                           "\n2. Feet to Yards" + "\n3. Meters to Inches" + 
                           "\n4. Inches to Meters" + "\n5. Inches to Centimeters");
        int choice = sc.nextInt();

        // Prompt the user to input the value to be converted
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        // Variable to store the result of the conversion
        double result = 0;

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            result = convertYardsToFeet(value); // Convert yards to feet
        } else if (choice == 2) {
            result = convertFeetToYards(value); // Convert feet to yards
        } else if (choice == 3) {
            result = convertMetersToInches(value); // Convert meters to inches
        } else if (choice == 4) {
            result = convertInchesToMeters(value); // Convert inches to meters
        } else if (choice == 5){
			result = convertInchesToCm(value); // Convert inches to centimeters
        } else {
			System.out.println("Invalid choice."); // Handle invalid choice
		}

        // Print the conversion result
        System.out.println("Converted value: " + result);

        sc.close(); // Close the Scanner object to release resources
    }
}

