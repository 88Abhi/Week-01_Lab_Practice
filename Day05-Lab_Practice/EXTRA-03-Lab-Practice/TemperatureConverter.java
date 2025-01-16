import java.util.Scanner;

public class TemperatureConverter 
{

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) 
	{
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) 
	{
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input: Temperature and conversion choice
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        System.out.print("Convert to (1) Celsius or (2) Fahrenheit? Enter choice: ");
        int choice = sc.nextInt();

        // Perform conversion based on user choice
        if (choice == 1) {
            System.out.println("Converted Temperature: " + fahrenheitToCelsius(temperature) + "°C");
        } else if (choice == 2) {
            System.out.println("Converted Temperature: " + celsiusToFahrenheit(temperature) + "°F");
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
