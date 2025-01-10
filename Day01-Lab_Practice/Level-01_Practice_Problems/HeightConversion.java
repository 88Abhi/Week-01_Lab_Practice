// Create a class named HeightConversion to convert height from cm to feet and inches
import java.util.Scanner;

class HeightConversion 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable heightCm and take user input
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to feet and inches
        double totalInches = heightCm / 2.54; // 1 inch = 2.54 cm
        int feet = (int) (totalInches / 12);  // 1 foot = 12 inches
        double inches = totalInches % 12;

        // Display the height in cm, feet, and inches
        System.out.println("Your height in cm is " + heightCm +
                           ", while in feet is " + feet + " and inches is " + inches);
    }
}
