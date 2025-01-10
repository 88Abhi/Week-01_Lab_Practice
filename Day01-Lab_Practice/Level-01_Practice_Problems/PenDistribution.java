// Create a class named PenDistribution to calculate pens per student and remaining pens
class PenDistribution {
    public static void main(String[] args) {
        // Create variables for total pens and number of students
        int totalPens = 14, totalStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Display the distribution details
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
