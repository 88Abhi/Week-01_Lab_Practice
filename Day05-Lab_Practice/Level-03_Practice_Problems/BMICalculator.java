// Create a class BMICalculator to find the Body Mass Index (BMI) of all the persons in a team of 10 member
import java.util.Scanner;

class BMICalculator 
{
    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] heightWeightArray) 
	{
        // Create a 2D string array to store height, weight, BMI, and status 
        String[][] bmiData = new String[10][4];

        // Iterate through each person's height and weight to calculate BMI
        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
			
            // Convert height from centimeters to meters
            double heightInMeters = heightWeightArray[i][1] / 100.0;
			
            // Calculate BMI using the formula 
            double bmi = weight / (heightInMeters * heightInMeters);
            
            // Variable to store the BMI status 
            String status;

            // Determine BMI status 
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store the height in the 2D string array, formatted to two decimal places
            bmiData[i][0] = String.format("%.2f", heightWeightArray[i][1]);
			
            // Store the weight in the 2D string array, formatted to two decimal places
            bmiData[i][1] = String.format("%.2f", weight);
            
			// Store the BMI value in the 2D string array, formatted to two decimal places
            bmiData[i][2] = String.format("%.2f", bmi);
            
			// Store the BMI status in the 2D string array
            bmiData[i][3] = status;
        }
        // Return the 2D string array
        return bmiData;
    }

    // Method to display BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) 
	{
        // Print the table header with column names
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

        // Iterate through the 2D array and print each row of data
        for (int i = 0; i < 10; i++) {
            // Print height, weight, BMI, and status for each person
            System.out.println(bmiData[i][0] + "\t\t" + bmiData[i][1] + "\t\t" + bmiData[i][2] + "\t\t" + bmiData[i][3]);
        }
    }

    public static void main(String[] args) 
	{
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store height and weight
        double[][] heightWeightArray = new double[10][2];

        // Prompt the user to enter height and weight for each person
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        // Loop to take input
        for (int i = 0; i < 10; i++) {
            // Prompt the user to enter weight 
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            heightWeightArray[i][0] = sc.nextDouble();
			
            // Prompt the user to enter height
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            heightWeightArray[i][1] = sc.nextDouble();
        }

        // Call the method to calculate BMI and get the resulting 2D string array
        String[][] bmiData = calculateBMI(heightWeightArray);

        // Call the method to display BMI data in a tabular format
        displayBMIData(bmiData);

        // Close the scanner object
        sc.close();
    }
}
