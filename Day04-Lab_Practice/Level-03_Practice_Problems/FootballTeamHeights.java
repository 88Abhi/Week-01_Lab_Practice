// Class to perform operations on player heights
import java.util.Arrays; 
import java.util.Scanner;

class FootballTeamHeights 
{
    // Method to generate random heights for 11 players
    public static int[] generateHeights() 
	{
        // Initialize an array to store heights of 11 players
        int[] heights = new int[11];
        
        // Loop to generate random heights for each player
        for (int i = 0; i < heights.length; i++) {
            // Generate a random height between 150 and 250 cm
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        // Return the array of generated heights
        return heights;
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) 
	{
        // Initialize sum to 0
        int sum = 0;

        // Loop through the array to calculate the total sum
        for (int value : array) {
            sum += value;
        }

        // Return the total sum
        return sum;
    }

    // Method to calculate the mean height of the players
    public static double calculateMean(int[] array) 
	{
        // Calculate the sum of all elements in the array
        int sum = calculateSum(array);

        // Divide the sum by the number of elements to get the mean
		double mean = (double) sum / array.length;
        return mean;
    }

    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] array) 
	{
        // Initialize shortest to the maximum possible value
        int shortest = Integer.MAX_VALUE;

        // Loop through the array to find the shortest height
        for (int height : array) {
            if (height < shortest) {
                shortest = height;
            }
        }

        // Return the shortest height
        return shortest;
    }

    // Method to find the tallest height in the array
    public static int findTallestHeight(int[] array) 
	{
        // Initialize tallest to the minimum possible value
        int tallest = Integer.MIN_VALUE;

        // Loop through the array to find the tallest height
        for (int height : array) {
            if (height > tallest) {
                tallest = height;
            }
        }

        // Return the tallest height
        return tallest;
    }

    // Main method to execute the program
    public static void main(String[] args) 
	{
        // Create a Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Generate random heights for 11 players
        int[] heights = generateHeights();

        // Display the heights of all players
        System.out.println("Heights of the players: " + Arrays.toString(heights));

        // Find and display the mean height
        double meanHeight = calculateMean(heights);
        System.out.println("Mean height of all players is: " + meanHeight);

        // Find and display the shortest height
        int shortestHeight = findShortestHeight(heights);
        System.out.println("Shortest height: " + shortestHeight + " cm");

        // Find and display the tallest height
        int tallestHeight = findTallestHeight(heights);
        System.out.println("Tallest height: " + tallestHeight + " cm");

        // Close the Scanner object
        sc.close();
    }
}
