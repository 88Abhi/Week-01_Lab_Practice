// TeamBMI Class calculates the BMI for multiple individuals in a team based on 
// their height and weight.
import java.util.Scanner;

class TeamBMI 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of persons.
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        // Declare arrays to store height, weight, BMI, and status.
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height and weight for each person.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            // Convert height to meters and calculate BMI.
            bmi[i] = weight[i] / Math.pow(height[i] / 100, 2);

            // Determine BMI category.
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and status of each person.
        System.out.println("\nBMI Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + height[i] +
                               " cm, Weight = " + weight[i] + " kg, BMI = " + bmi[i] +
                               ", Status = " + status[i]);
        }

        // Close the Scanner object.
        input.close();
    }
}
