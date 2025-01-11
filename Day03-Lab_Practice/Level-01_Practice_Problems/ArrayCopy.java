// This class takes a 2D array as input from the user and 
// copies its elements into a 1D array.
import java.util.Scanner;

class ArrayCopy 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input. 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the 2D array. 
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Initialize a 2D array with the specified dimensions. 
        int[][] matrix = new int[rows][columns];

        // Prompt the user to enter elements of the 2D array. 
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Initialize a 1D array to store elements of the 2D array. 
        int[] singleArray = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array. 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleArray[index++] = matrix[i][j];
            }
        }

        // Display the elements of the 1D array. 
        System.out.print("1D Array elements: ");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }

        // Close the Scanner object to release resources. 
        input.close();
    }
}
