// Class to calculate trigonometric functions for a given angle
import java.util.Scanner; 

class TrigonometricFunctions 
{
    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) 
	{
        // Convert the angle from degrees to radians for trigonometric calculations
        double radians = Math.toRadians(angle); 

        // Calculate sine of the angle
        double sine = Math.sin(radians); 

        // Calculate cosine of the angle
        double cosine = Math.cos(radians); 

        // Calculate tangent of the angle
        double tangent = Math.tan(radians); 

        // Return all results as an array of sine, cosine, and tangent
        return new double[]{sine, cosine, tangent};  
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble(); 

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle); 

        // Display the results to the user
        System.out.println("Trigonometric values for the angle " + angle + ": " +
                   "Sine: " + results[0] + ", " +
                   "Cosine: " + results[1] + ", " +
                   "Tangent: " + results[2]);


        // Close the Scanner object to release resources
        sc.close();
    }
}
