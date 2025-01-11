// This class calculates the mean height of 11 football players based on 
// their heights provided by the user.
import java.util.Scanner;

class FootballTeamHeight 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Declare an array to store the heights of 11 players. 
        double[] heights = new double[11];

        // Prompt the user to input the heights of the players. 
        System.out.println("Enter the heights (in cm) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Calculate the sum of all heights. 
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }

        // Calculate the mean height by dividing the sum by the number of players.
        double mean = sum / heights.length;

        // Display the mean height of the football team. 
        System.out.println("The mean height of the football team is: " + mean + " cm");

        // Close the Scanner object to release system resources. 
        input.close();
    }
}
