// Class named VotingEligibility for checking the age eligibility criteria for voting
import java.util.Scanner;

class VotingEligibility 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        // This will help to input the ages of students.
        Scanner input = new Scanner(System.in);

        // Declare an array to store the ages of 10 students. 
        // This array will hold the user-inputted values.
        int[] ages = new int[10];

        // Prompt the user to enter the ages of 10 students. 
        // Validate each input and store it in the array.
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Check if the age is negative. 
            // If negative, display an error and exit the program.
            if (ages[i] < 0) {
                System.err.println("Invalid age entered. Please enter non-negative values.");
                System.exit(0);
            }
        }

        // Check voting eligibility for each student. 
        // Print whether the student can vote or not based on the age.
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        // Close the Scanner object to free resources. 
        input.close();
    }
}
