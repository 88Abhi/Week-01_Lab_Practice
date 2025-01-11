// TeamBMI2D Class calculates BMI for multiple individuals in a team using a 
// 2D array to store height, weight, and BMI, and categorizes them based on BMI.

import java.util.Scanner;

class TeamBMI2D 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of persons.
        System.out.print("Enter the number of persons: ");
        int numberOfPerson = input.nextInt();

        // Declare a 2D array to store height, weight, and BMI.
        double[][] personData = new double[numberOfPerson][3];
        String[] status = new String[numberOfPerson];

        // Input height and weight for each person and calculate BMI.
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();

            // Convert height to meters and calculate BMI.
            personData[i][2] = personData[i][1] / Math.pow(personData[i][0] / 100, 2);

            // Determine BMI category.
            if (personData[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                status[i] = "Normal weight";
            } else if (personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and status of each person.
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] +
                               " cm, Weight = " + personData[i][1] + " kg, BMI = " + personData[i][2] +
                               ", Status = " + status[i]);
        }

        // Close the Scanner object.
        input.close();
    }
}
