// Create a class named TriangleArea to calculate the area of a triangle
import java.util.Scanner;

class TriangleArea 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create variables base and height and take user inputs
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Compute the area of the triangle, Formula: 1/2 * base * height
        double areaCmSquare = 0.5 * base * height; 

        // Convert area to square inches (1 inch = 2.54 cm)
        double areaInSquare = areaCmSquare / (2.54 * 2.54);

        // Display the area in square cm and square inches
        System.out.println("The area of the triangle is " + areaCmSquare +
                           " square cm and " + areaInSquare + 
                           " square inches");
						   
	  // Closing input object after task completion
        input.close();
    }
}
