// Class to calculate wind chill temperature
import java.util.Scanner; 

class WindChillCalculator 
{
    // Method to calculate wind chill temperature using the formula
    public static double calculateWindChill(double temperature, double windSpeed) 
	{
        // Calculate wind chill temperature using the provided formula
		double temp = 35.74 + (0.6215 * temperature) + 
               ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
        return  temp;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble(); 

        // Prompt the user to enter the wind speed
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble(); 

        // Call the method to calculate wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed); 

        // Display the calculated wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill + "°F");

        // Close the Scanner object to release resources
        sc.close();
    }
}
