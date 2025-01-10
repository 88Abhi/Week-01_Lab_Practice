// Create a class named FeeDiscountCalculator to calculate the discounted fee
import java.util.Scanner;

class FeeDiscountCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable fee and take user input
        System.out.print("Enter the fee: ");
        double fee = input.nextDouble();

        // Create a variable discountPercent and take user input
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Compute the discount and final discounted fee
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        // Display the discount details
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + discountedFee);
    }
}
