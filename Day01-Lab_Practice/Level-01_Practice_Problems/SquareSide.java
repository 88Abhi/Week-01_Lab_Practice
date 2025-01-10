// Create a class named SquareSide to calculate the side of a square
import java.util.Scanner;

class SquareSide 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable perimeter and take user input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Compute the side of the square
        double side = perimeter / 4; // Perimeter of Square = 4 * side

        // Display the side length
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		
		// Closing input object after task completion
        input.close();
    }
}
