// Class StudentGrade to handle student marks, percentage, and grade calculation
import java.util.Scanner;

class StudentGrade 
{
    // Method to generate random 2-digit scores for 
	// Physics, Chemistry, and Math for each student
    public static int[][] generateRandomScores(int n) 
	{
        // 2D array to store the scores for Physics, Chemistry, and Math
        int[][] scores = new int[n][3];

        // Generate random scores between 0 and 100 for each subject
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 101); // Physics score
            scores[i][1] = (int) (Math.random() * 101); // Chemistry score
            scores[i][2] = (int) (Math.random() * 101); // Math score
        }
		
        // Return the 2D array of scores
        return scores;
    }
	
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) 
	{
        // 2D array to store total, average, and percentage for each student
        double[][] results = new double[scores.length][3];

        // Calculate total, average, and percentage for each student
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 300.0) * 100; 

            // Store the results for the current student
            results[i][0] = total;
            results[i][1] = average;
			
			// Round off percentage to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        // Return the 2D array of results
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrade(double[][] results) 
	{
        // Array to store grades for each student
        String[] grades = new String[results.length];

        // Calculate the grade for each student based on percentage
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            // Assign grade based on the percentage
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Return the grades
        return grades;
    }

    // Method to display the student scorecards in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) 
	{
        // Print the table header
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");
		
        // Print the scores, total, percentage, and grade for each student
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10.2f%-10s\n", (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
		
        // Generate random scores for each student
        int[][] scores = generateRandomScores(n);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Calculate grades for each student
        String[] grades = calculateGrade(results);

        // Display the scorecard for each student
        displayScorecard(scores, results, grades);

        // Close the Scanner to release system resources
        sc.close();
    }
}