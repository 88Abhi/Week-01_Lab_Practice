// This program calculates the Body Mass Index (BMI) of a person.
// BMI = weight (kg) / (height in meters)^2. Height is converted from cm to meters.

import java.util.Scanner;

class BMICalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for weight and height.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input weight in kilograms.
        System.out.print("Enter your weight (in kg): ");
        double weight = input.nextDouble();

        // Prompt the user to input height in centimeters.
        System.out.print("Enter your height (in cm): ");
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters.
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula.
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine the weight status based on BMI.
        String weightStatus;
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi <= 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Display the BMI value and weight status.
        System.out.println("Your BMI is " + bmi + " (" + weightStatus + ").");

        // Close the Scanner to release resources.
        input.close();
    }
}
