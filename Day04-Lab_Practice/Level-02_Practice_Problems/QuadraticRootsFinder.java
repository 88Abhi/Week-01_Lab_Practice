// Class to find roots of a quadratic equation
import java.util.Scanner;

class QuadraticRootsFinder 
{
    // Method to calculate the roots of the equation
    public static double[] findRoots(double a, double b, double c) 
    {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - (4 * a * c);

        // Check the values of roots based on the discriminant
        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[0]; // Return an empty array
        }
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the roots based on the result
        if (roots.length == 2) {
            System.out.println("The equation has two real roots: " + 
                               roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + 
                               roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}