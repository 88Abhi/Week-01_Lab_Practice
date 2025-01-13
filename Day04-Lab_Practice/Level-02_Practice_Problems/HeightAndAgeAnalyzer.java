// Class to find the youngest and tallest among three friends 
// based on their ages and heights
import java.util.Scanner;

class HeightAndAgeAnalyzer 
{
    // Method to find the youngest friend that takes an 
    // array of ages as input 
    public static int findYoungest(int[] ages) 
    {
        // Initialize the index of the youngest friend as the first one
        int youngestIndex = 0;

        // Loop through the ages to compare and find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Return the index of the youngest friend
        return youngestIndex;
    }

    // Method to find the tallest friend takes an array of heights as input
    public static int findTallest(int[] heights) 
    {
        // Initialize the index of the tallest friend as the first one
        int tallestIndex = 0;

        // Loop through the heights to compare and find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Return the index of the tallest friend
        return tallestIndex;
    }

    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare an array to store the names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Declare an array to store the ages of the friends
        int[] ages = new int[3];

        // Declare an array to store the heights of the friends
        int[] heights = new int[3];

        // Loop to take input for each friend's age and height
        for (int i = 0; i < friends.length; i++) {
            // Prompt the user to enter the age of the friend
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            // Prompt the user to enter the height of the friend in centimeters                     
            System.out.print("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }

        // Call the findYoungest method to determine the youngest friend's index
        int youngestIndex = findYoungest(ages);

        // Call the findTallest method to determine the tallest friend's index
        int tallestIndex = findTallest(heights);

        // Print the youngest friend's name and age
        System.out.println("The youngest friend is " + friends[youngestIndex] +
                           " with age " + ages[youngestIndex] + ".");

        // Print the tallest friend's name and height
        System.out.println("The tallest friend is " + friends[tallestIndex] + 
                           " with height " + heights[tallestIndex] + " cm.");

        // Close the Scanner object to release resources
        sc.close();
    }
}