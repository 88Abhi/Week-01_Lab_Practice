// A class StudentScoreCard to Compute the total, average, and the percentage score 
// of students in 3 subjects physics, chemistry, and maths. 
import java.util.Random;
import java.util.Scanner;

class StudentScoreCard 
{
    // Method to generate random 2-digit marks for Physics, Chemistry, and Math 
    public static int[][] generateScores(int numStudents) 
    {
	 // 2D array to store PCM scores for each student
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; 
        
        // Generate random scores for each student in 3 subjects
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100);  
            scores[i][1] = rand.nextInt(100);  
            scores[i][2] = rand.nextInt(100);  
        }
        
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) 
    {
	  // 2D array to store total, average, and percentage for each student
        double[][] results = new double[scores.length][4];  
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  
            double average = total / 3.0;  
            double percentage = (total / 300.0) * 100;  
            
            // Round off values to 2 decimal places
            results[i][0] = total;         
            results[i][1] = Math.round(average * 100.0) / 100.0;  
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) 
    {
        System.out.println("Student\tPhysics\t\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        
        // Loop through each student and display their scorecard
        for (int i = 0; i < scores.length; i++) {
            double roundedAverage = Math.round(results[i][1] * 100.0) / 100.0;
	     double roundedPercentage = Math.round(results[i][2] * 100.0) / 100.0;
            System.out.print((i + 1) + "\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" +
				   scores[i][2] + "\t" + (int) results[i][0] + "\t" + 
                             roundedAverage + "\t" + roundedPercentage + "%\n");
        }
    }

    public static void main(String[] args) 
    {
	  // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
		
	 // Prompt for user to take Number of students as input
	 System.out.print("Enter no of Students: ");
        int numStudents = sc.nextInt(); 
        
        // Generate random scores for students
        int[][] scores = generateScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);
        
        // Display the scorecard
        displayScoreCard(scores, results);

        // Close the Scanner object
        sc.close();
    }
}