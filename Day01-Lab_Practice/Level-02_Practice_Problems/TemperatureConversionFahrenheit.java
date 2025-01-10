// Create a class named TemperatureConversionFahrenheit to convert temperature from Fahrenheit to Celsius
// and display the result using the appropriate conversion formula.
import java.util.Scanner;

class TemperatureConversionFahrenheit 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for temperature in Fahrenheit.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the temperature in Fahrenheit and store it in a variable.
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Use the formula (Fahrenheit − 32) × 5/9 to calculate the temperature in Celsius.
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature in Celsius.
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        // Close the Scanner object to release resources.
        input.close();
    }
}
