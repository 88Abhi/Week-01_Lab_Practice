// Utility class to perform unit conversions for temperature, weight, and volume
import java.util.Scanner;

class UnitConverterTemperature 
{
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) 
    {
        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) 
    {
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) 
    {
        // Conversion factor for pounds to kilograms
        double pounds2kilograms = 0.453592;

        // Perform and return the conversion
        double kilograms = pounds * pounds2kilograms;
        return kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) 
    {
        // Conversion factor for kilograms to pounds
        double kilograms2pounds = 2.20462;

        // Perform and return the conversion
        double pounds = kilograms * kilograms2pounds;
        return pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) 
    {
        // Conversion factor for gallons to liters
        double gallons2liters = 3.78541;

        // Perform and return the conversion
        double liters = gallons * gallons2liters;
        return liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) 
    {
        // Conversion factor for liters to gallons
        double liters2gallons = 0.264172;

        // Perform and return the conversion
        double gallons = liters * liters2gallons;
        return gallons;
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to select a conversion type
        System.out.println("Select a conversion type:" + "\n1. Fahrenheit to Celsius" + 
                           "\n2. Celsius to Fahrenheit" + "\n3. Pounds to Kilograms" + 
                           "\n4. Kilograms to Pounds" + "\n5. Gallons to Liters" + 
                           "\n6. Liters to Gallons");
        int choice = sc.nextInt();

        // Prompt the user to input the value to be converted
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        // Variable to store the result of the conversion
        double result = 0;

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            result = convertFahrenheitToCelsius(value); // Convert Fahrenheit to Celsius
        } else if (choice == 2) {
            result = convertCelsiusToFahrenheit(value); // Convert Celsius to Fahrenheit
        } else if (choice == 3) {
            result = convertPoundsToKilograms(value); // Convert pounds to kilograms
        } else if (choice == 4) {
            result = convertKilogramsToPounds(value); // Convert kilograms to pounds
        } else if (choice == 5) {
            result = convertGallonsToLiters(value); // Convert gallons to liters
        } else if (choice == 6) {
            result = convertLitersToGallons(value); // Convert liters to gallons
        } else {
            System.out.println("Invalid choice."); // Handle invalid choice
        }

        // Print the conversion result
        System.out.println("Converted value: " + result);

        sc.close(); // Close the Scanner object to release resources
    }
}