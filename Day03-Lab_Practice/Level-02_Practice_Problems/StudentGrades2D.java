// This program calculates the percentage, grade, and remarks for students // based on their marks in three subjects: Physics, Chemistry, and Maths.
import java.util.Scanner;

class StudentGrades2D
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        
        // Take input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            // Get marks for Physics, Chemistry, and Maths for each student
            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else if (j == 2) subject = "Maths";
                
                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Please enter positive marks for " 
                                           + subject + ".");
                    }
                } while (marks[i][j] < 0);
            }

            // Calculate the total marks and percentage for the student
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
			
	     // percentage is the average of the three subjects
            percentages[i] = (totalMarks / 3.0); 
            
            // Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Remedial Standard
            }
        }
        
        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":\n" +
                               "Physics Marks: " + marks[i][0] + ", " +
                               "Chemistry Marks: " + marks[i][1] + ", " +
                               "Maths Marks: " + marks[i][2] + ", " +
                               "Percentage: " + percentages[i] + "%, " +
                               "Grade: " + grades[i] + "\n");
        }
        
        // Close the scanner
        input.close();
    }
}

