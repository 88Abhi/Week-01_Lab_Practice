// Class to check voting eligibility for students based on their age
import java.util.Scanner;

class StudentVoteChecker 
{
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) 
    {
        // Validate if age is negative return false 
        if (age < 0) {
            return false;
        }

        // Return true if age is 18 or above, otherwise false
        return age >= 18;
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }

        // Check voting eligibility for each student and display results
        System.out.println("\nVoting eligibility results:");

        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + 
                               studentAges[i] + ") - " +
                               (canVote ? "Eligible to vote" : 
                               "Not eligible to vote"));
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}

