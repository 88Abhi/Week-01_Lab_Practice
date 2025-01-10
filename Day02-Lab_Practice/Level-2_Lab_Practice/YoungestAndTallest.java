// This program determines the youngest and tallest among three friends.
// It takes user inputs for ages and heights of the three friends.

import java.util.Scanner;

class YoungestAndTallest 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for ages and heights.
        Scanner input = new Scanner(System.in);

        // Input ages and heights for Amar.
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();

        // Input ages and heights for Akbar.
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();

        // Input ages and heights for Anthony.
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();

        // Determine the youngest among the three.
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngest = (youngestAge == amarAge) ? "Amar" :
                          (youngestAge == akbarAge) ? "Akbar" : "Anthony";

        // Determine the tallest among the three.
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallest = (tallestHeight == amarHeight) ? "Amar" :
                         (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        // Display the results.
        System.out.println("The youngest is " + youngest + " with age " + youngestAge + ".");
        System.out.println("The tallest is " + tallest + " with height " + tallestHeight + " cm.");

        // Close the Scanner to release resources.
        input.close();
    }
}
