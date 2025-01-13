// A program to demonstrate Array Index Out Of Bounds Exception

import java.util.Scanner; 
class ArrayIndexOutOfBoundsExceptionDemo 
{
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array) 
	{
        // Access an invalid index to cause ArrayIndexOutOfBoundsException
        System.out.println(array[array.length + 1]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch blocks
    public static void handleArrayIndexOutOfBoundsException(String[] array) 
	{
        try {
            // Access an invalid index to cause ArrayIndexOutOfBoundsException
            System.out.println(array[array.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and handle generic runtime exception
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
		// Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user for array input
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
		sc.nextLine();

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call the method to generate ArrayIndexOutOfBoundsException
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (Exception e) {
            System.out.println("Exception caught during generation: " + e.getMessage());
        }

        // Call the method to handle ArrayIndexOutOfBoundsException
        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);

		// Close the Scanner object
        sc.close(); 
    }
}
