// Create a class named FeeDiscount to calculate discounted fee
class FeeDiscount
{
    public static void main(String[] args) 
	{
        // Create variables for fee and discount percentage
        int fee = 125000, discountPercent = 10;

        // Calculate discount and final discounted fee
        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;

        // Display the discount details
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + discountedFee);
    }
}
