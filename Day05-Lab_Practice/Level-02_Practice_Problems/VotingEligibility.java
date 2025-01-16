// Class VotingEligibility to handle age input and voting eligibility
import java.util.Scanner;

class VotingEligibility 
{
    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) 
	{
        // Array to store the ages of n students
        int[] ages = new int[n];

        // Generate random 2-digit age for each student
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        // Return the array of ages
        return ages;
    }

    // Method to check voting eligibility for students based on age
    public static String[][] checkVotingEligibility(int[] ages) 
	{
        // 2D array to store age and voting eligibility
        String[][] eligibility = new String[ages.length][2];

        // Iterate through each student's age and check eligibility
        for (int i = 0; i < ages.length; i++) {
            // Validate if age is negative, if so, the student cannot vote
            if (ages[i] < 0) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Cannot Vote";
            } 
            // If the student is 18 or older, they can vote
            else if (ages[i] >= 18) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Can Vote";
            } 
            // Otherwise, the student cannot vote
            else {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Cannot Vote";
            }
        }

        // Return the 2D array with age and voting eligibility
        return eligibility;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] eligibility) 
	{
        // Print the table header
        System.out.println("Age" + "\t\t" + "Voting Eligibility");

        // Print each student's age and eligibility
        for (String[] student : eligibility) {
            System.out.println(student[0] + "\t\t" + student[1]);
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random ages for the students
        int[] ages = generateRandomAges(n);

        // Check the voting eligibility based on the ages
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the voting eligibility for each student
        displayVotingEligibility(eligibility);

        // Close the Scanner object
        sc.close();
    }
}
