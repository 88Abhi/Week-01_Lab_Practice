// Create a class GradeCalculator for calculating Grade based on the percentage of a student in all subjects
import java.util.Scanner;

class GradeCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt(); // Store marks for Physics

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt(); // Store marks for Chemistry

        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt(); // Store marks for Maths

        // Calculate total marks by summing up the marks of all three subjects
        int totalMarks = physics + chemistry + maths;

        // Calculate percentage using the formula: totalMarks / number of subjects
        double percentage = (double) totalMarks / 3;

        // Initialize grade and remarks variables
        char grade; 
        String remarks;

        // Determine grade and remarks based on the calculated percentage
        if (percentage >= 80) {
            // Percentage 80% and above corresponds to Grade A
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            // Percentage 70% to 79% corresponds to Grade B
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            // Percentage 60% to 69% corresponds to Grade C
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            // Percentage 50% to 59% corresponds to Grade D
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            // Percentage 40% to 49% corresponds to Grade E
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            // Percentage below 40% corresponds to Grade R (Remedial standards)
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Print the total marks, percentage, grade, and remarks
        System.out.println("Your Total Marks are: " + totalMarks + "\n" +
						   "Your Percentage is: " + percentage + "%\n" +
						   "You have achieved Grade: " + grade + "\n" +
						   "Remarks: " + remarks);


        // Close the Scanner object to free resources
        input.close();
    }
}
