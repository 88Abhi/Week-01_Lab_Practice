// Create a class named AverageMarks to calculate the average of PCM marks
class AverageMarks 
{
    public static void main(String[] args) 
	{
        // Create a variable name to store the name of the student
        String name = "Sam";

        // Create variables for marks in Maths, Physics, Chemistry
        // and Total number of subjects.
        int marksInMaths = 94, marksInPhysics = 95, 
            marksInChemistry = 96, totalSubjects = 3;

        // Create variables for Total marks in Maths, Physics,
        // and Chemistry.
	  int totalMarks = marksInMaths + marksInPhysics +            
                         marksInChemistry;
		
	  // Calculating the average pecent marks of all subjects
        double averagePercentMarksOfPCM = (double)totalMarks / 
                                          (totalSubjects * 100) * 100;

        // Display the average marks
        System.out.println(name + "'s average mark in PCM is " +
                           averagePercentMarksOfPCM);
    }
}