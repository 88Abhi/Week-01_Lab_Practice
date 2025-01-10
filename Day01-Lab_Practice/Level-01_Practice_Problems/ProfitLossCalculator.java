// Create a class named ProfitLossCalculator to calculate 
// profit and loss in number and percentage
class ProfitLossCalculator 
{
    public static void main(String[] args) 
	{
        // Create variables for cost price and selling price
        int costPrice = 129, sellingPrice = 191;

        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Display the profit details
        System.out.println("The Cost Price is INR " + costPrice +
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit +
                           " and the Profit Percentage is " +  
                           profitPercentage + "%");
    }
}