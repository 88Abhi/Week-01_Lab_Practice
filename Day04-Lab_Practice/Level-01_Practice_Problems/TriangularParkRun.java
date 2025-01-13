// Create a Class named TriangularParkRun to calculate the number of rounds required for a 5 km run in a triangular park
import java.util.Scanner; 

class TriangularParkRun 
{
    // Method to calculate the perimeter of the triangular park
    public static double calculatePerimeter(double side1, double side2, double side3) 
	{
        // Add all three sides of the triangle to get the perimeter
		double sum = side1 + side2 + side3;
		
		// Returns the perimeter of the triangle
        return  sum;
    }

    // Method to calculate the number of rounds required to complete a 5 km run
    public static int calculateRounds(double perimeter) 
	{
        // Convert 5 km to meters for calculation
        double totalDistance = 5000.0; 
		
        // Calculate the number of rounds required by dividing total distance by the perimeter
		// Use Math.ceil to round up to the next number
		int noOfRounds = (int) Math.ceil(totalDistance / perimeter); 
        return noOfRounds;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides of the triangular park
        System.out.print("Enter the length of the first side of the park in meters: ");
        double side1 = sc.nextDouble(); 

        System.out.print("Enter the length of the second side of the park in meters: ");
        double side2 = sc.nextDouble(); 

        System.out.print("Enter the length of the third side of the park in meters: ");
        double side3 = sc.nextDouble(); 

        // Calculate the perimeter of the triangular park
        double perimeter = calculatePerimeter(side1, side2, side3); 

        // Calculate the number of rounds required for a 5 km run
        int rounds = calculateRounds(perimeter); 

        // Display the result to the user
        System.out.println("The athlete needs to complete " + rounds + 
                           " rounds of the park to cover a distance of 5 km.");

        // Close the Scanner object to release resources
        sc.close();
    }
}
