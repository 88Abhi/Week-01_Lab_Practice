import java.util.Scanner;

class NumberAnalysis 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        // This will allow input of 5 numbers into an array.
        Scanner input = new Scanner(System.in);

        // Declare an array to store 5 numbers. 
        int[] numbers = new int[5];

        // Prompt the user to enter 5 numbers. 
        // Store each number in the array after validation.
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array to check properties of each number. 
        // Determine positive, negative, zero, even, or odd.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print("Number " + numbers[i] + " is positive and ");
                if (numbers[i] % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array. 
        // Display whether they are equal, greater, or less.
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        // Close the Scanner object to free resources. 
        // This ensures efficient use of memory and system resources.
        input.close();
    }
}
