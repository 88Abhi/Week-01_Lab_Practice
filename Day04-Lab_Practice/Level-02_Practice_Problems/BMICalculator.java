// Class to calculate BMI and determine BMI status for team members
import java.util.Scanner;

public class BMICalculator 
{
    // Method to calculate BMI for all individuals and populate the BMI column
    public static void calculateBMI(double[][] data) 
    {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInCm = data[i][1]; // Height in cm
            double heightInMeters = heightInCm / 100; // height to meters

            // Calculate BMI
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status based on BMI value
    public static String[] determineBMIStatus(double[][] data) 
    {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // 2D array for weight, height, and BMI
        double[][] teamData = new double[10][3]; 

        // Input weight and height for 10 team members
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI for all team members
        calculateBMI(teamData);

        // Determine BMI statuses for all team members
        String[] bmiStatuses = determineBMIStatus(teamData);

        // Display results
        System.out.println("\nTeam Members' BMI Details:");
        System.out.println("Member\t\tWeight (kg)\tHeight (cm)\t\tBMI\t\t\tStatus");
        for (int i = 0; i < teamData.length; i++) {
            System.out.println("Member " + (i + 1) + "\t" + teamData[i][0] + 
                               "\t\t" + teamData[i][1] + "\t\t" + 
                               teamData[i][2] + "\t\t" + bmiStatuses[i]);
        }

        // Close the scanner
        sc.close();
    }
}