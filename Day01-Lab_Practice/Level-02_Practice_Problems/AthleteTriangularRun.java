// Create a class named AthleteTriangularRun to calculate the number of rounds
// an athlete needs to complete in a triangular park to achieve a total distance of 5 km.
import java.util.Scanner;

class AthleteTriangularRun 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for the sides of the triangle.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the lengths of the three sides of the triangular park.
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle.
        double perimeter = side1 + side2 + side3;

        // Define the total distance the athlete wants to run (in meters).
        double totalDistance = 5 * 1000; // 1 km = 1000 meters

        // Calculate the number of rounds the athlete needs to complete.
        double rounds = totalDistance / perimeter;

        // Display the number of rounds needed.
        System.out.println("The total number of rounds the athlete will run is " +
                           rounds + " to complete 5 km.");


        // Close the Scanner object to release resources.
        input.close();
    }
}
