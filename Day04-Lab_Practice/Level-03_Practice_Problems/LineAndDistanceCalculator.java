// Create a class LineAndDistanceCalculator for calculating Euclidean distance 
// between two points as well as the equation of the line using those two points
import java.util.Scanner;

class LineAndDistanceCalculator 
{
    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, 
                                                    double x2, double y2) 
    {
        // Calculate the squared difference in x-coordinates
        double xDiffSquared = Math.pow(x2 - x1, 2);
		
        // Calculate the squared difference in y-coordinates
        double yDiffSquared = Math.pow(y2 - y1, 2);
		
        // Compute and return the square root of the sum of squared differences
        return Math.sqrt(xDiffSquared + yDiffSquared);
    }

    // Method to calculate the slope and y-intercept of a line 
    // passing through two points
    public static double[] calculateLineEquation(double x1, double y1, 
                                                 double x2, double y2) 
    {
	  // Variable to store the slope and y-intercept of the line
        double slope; 
        double yIntercept;

        // Calculate the slope using the formula m = (y2 - y1) / (x2 - x1)
        slope = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept using the formula b = y1 - m * x1
        yIntercept = y1 - slope * x1;

        // Return both slope and y-intercept as an array
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the coordinates of the first point
        System.out.println("Enter the coordinates of the first point (x1, y1):");
        double x1 = sc.nextDouble(); 
        double y1 = sc.nextDouble(); 

        // Prompt the user to enter the coordinates of the second point
        System.out.println("Enter the coordinates of the second point (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble(); 

        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);

        // Display the Euclidean distance
        System.out.println("Euclidean Distance between the points: " + distance);

        // Calculate the slope and y-intercept of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        // Extract slope and y-intercept from the returned array
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line in the form y = mx + b
        System.out.printf("Equation of the line: y = " + slope + "x + " +
                          yIntercept);

        // Close the Scanner object
        sc.close();
    }
}