// Create a class named ChocolateDistribution to calculate the number of chocolates
// each child receives and the number of remaining chocolates.
import java.util.Scanner;

class ChocolateDistribution 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for chocolates and children.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the total number of chocolates.
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Prompt the user to input the total number of children.
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the chocolates each child gets and the remaining chocolates.
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results with appropriate labels.
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates);

        // Close the Scanner object to release resources and avoid memory leaks.
        input.close();
    }
}

 