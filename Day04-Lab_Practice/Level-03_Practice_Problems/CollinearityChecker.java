// A class CollinearityChecker to find the 3 points that are collinear using the 
// slope formula and area of triangle formula
import java.util.Scanner;

class CollinearityChecker 
{
    // Method to check collinearity using the slope formula
    public static boolean checkCollinearityUsingSlope(double x1, double y1, double x2, 
                                                      double y2, double x3, double y3) 
    {
        // Calculate the slopes between the pairs of points
        double slopeAB = (y2 - y1) / (x2 - x1); 
        double slopeBC = (y3 - y2) / (x3 - x2); 
        double slopeAC = (y3 - y1) / (x3 - x1); 

        // Points are collinear if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean checkCollinearityUsingArea(double x1, double y1, double x2, 
                                                     double y2, double x3, double y3) 
    {
        // Calculate the area of the triangle formed by three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is 0
        return area == 0.0;
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the coordinates of the three points
        System.out.println("Enter the coordinates of the first point (x1, y1):");
        double x1 = sc.nextDouble(); 
        double y1 = sc.nextDouble(); 

        System.out.println("Enter the coordinates of the second point (x2, y2):");
        double x2 = sc.nextDouble(); 
        double y2 = sc.nextDouble(); 

        System.out.println("Enter the coordinates of the third point (x3, y3):");
        double x3 = sc.nextDouble(); 
        double y3 = sc.nextDouble(); 

        // Check collinearity using the slope formula
        boolean isCollinearUsingSlope = checkCollinearityUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using the area of triangle formula
        boolean isCollinearUsingArea = checkCollinearityUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results for both methods
        System.out.println("Are the points collinear using the slope formula? " + 
                           isCollinearUsingSlope);
        System.out.println("Are the points collinear using the area of triangle formula? " + 
                           isCollinearUsingArea);

        // Close the Scanner object
        sc.close();
    }
}