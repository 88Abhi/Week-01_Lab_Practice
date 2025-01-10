// Create a class named PurchasePriceCalculator to calculate the total purchase price
import java.util.Scanner;

class PurchasePriceCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable unitPrice and take user input
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();

        // Create a variable quantity and take user input
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        // Compute the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the total price
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
		
		// Close the Scanner Object
        input.close();
    }
}
