// Utility class to perform unit conversions between kilometers, miles, meters, and feet
import java.util.Scanner;

class UnitConverterKmMiles 
{
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) 
    {
        // Conversion factor for kilometers to miles
        double km2miles = 0.621371;

        // Perform and return the conversion
        double miles = km * km2miles;
        return miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) 
    {
        // Conversion factor for miles to kilometers
        double miles2km = 1.60934;

        // Perform and return the conversion
        double km = miles * miles2km;
        return km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) 
    {
        // Conversion factor for meters to feet
        double meters2feet = 3.28084;

        // Perform and return the conversions
        double feet = meters * meters2feet;
        return feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) 
    {
        // Conversion factor for feet to meters
        double feet2meters = 0.3048;

        // Perform and return the conversion
        double meters = feet * feet2meters;
        return meters;
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to select a conversion type
        System.out.println("Select a conversion type:" + "\n1. Kilometers to Miles" +
                           "\n2. Miles to Kilometers" + "\n3. Meters to Feet" + 
                           "\n4. Feet to Meters");
        int choice = sc.nextInt();

        // Prompt the user to input the value to be converted
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        // Variable to store the result of the conversion
        double result = 0;

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            result = convertKmToMiles(value); // Convert kilometers to miles
        } else if (choice == 2) {
            result = convertMilesToKm(value); // Convert miles to kilometers
        } else if (choice == 3) {
            result = convertMetersToFeet(value); // Convert meters to feet
        } else if (choice == 4) {
            result = convertFeetToMeters(value); // Convert feet to meters
        } else {
            System.out.println("Invalid choice."); // Handle invalid choice
        }

        // Print the conversion result
        System.out.println("Converted value: " + result);

        sc.close(); // Close the Scanner object to release resources
    }
}