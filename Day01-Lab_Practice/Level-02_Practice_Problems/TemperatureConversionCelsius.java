// Create a class named TemperatureConversion to convert temperature 
// from Celsius to Fahrenheit and display the result 
import java.util.Scanner;

class TemperatureConversionCelsius
{
    public static void main(String[] args)
    {
        // Create a Scanner object to take user input for 
        // temperature in Celsius.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the temperature in Celsius and 
        // store it in a variable named celsius.
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Use the formula (Celsius × 9/5) + 32 to calculate the                
        // temperature in Fahrenheit.
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the converted temperature in Fahrenheit.
        System.out.println("The " + celsius +
                           " celsius is " + fahrenheit + " fahrenheit");

        // Close the Scanner object to avoid memory leaks.
        input.close();
    }
}