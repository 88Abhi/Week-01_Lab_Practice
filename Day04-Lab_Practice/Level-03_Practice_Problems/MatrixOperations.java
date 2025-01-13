// Create a class MatrixOperations to perform matrix manipulation 
// operations like addition, subtraction, multiplication, and transpose
import java.util.Random; 

class MatrixOperations 
{
    // Method to create a random matrix with given no of rows and columns
    public static int[][] createRandomMatrix(int rows, int cols)  
    {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        
        // Fill the matrix with random values between 1 and 10
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { 
                // Random values between 1 and 10
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2)  
    {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        // Add elements of both matrices and store in result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) 
    {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        // Subtract corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)  
    {
	  // Number of columns in matrix1 = Number of rows in matrix2
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;  
        int[][] result = new int[rows][cols];
        
        // Multiply elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Initialize the element to 0
                result[i][j] = 0;  
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix)  
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        // Transpose the matrix by swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
 
    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix)  
    {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }
 
    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix)  
    {
        int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] -
                  matrix[1][2] * matrix[2][1]) - matrix[0][1] * 
                  (matrix[1][0] * matrix[2][2] - matrix[1][2] * 
                  matrix[2][0])+ matrix[0][2] * (matrix[1][0] * 
                  matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) 
    {
        double determinant = determinant2x2(matrix);
	
     	  // Return null if the matrix is not invertible
        if (determinant == 0) {
            System.out.println("Matrix is not invertible.");
            return null; 
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix)  
    {
        int det = determinant3x3(matrix);
	  // Return null if the matrix is not invertible
        if (det == 0) {
            System.out.println("Matrix is not invertible.");
            return null; 
        }
        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * 
                        matrix[2][1]) /(double) det;

        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] *
                        matrix[2][2]) /(double) det;

        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] *
                        matrix[1][1]) /(double) det;

        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] *
                        matrix[2][2]) /(double) det;

        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * 
                        matrix[2][0]) /(double) det;


        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] *
                        matrix[1][2]) /(double) det;


        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] *
                        matrix[2][0]) /(double) det;


        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * 
                        matrix[2][1]) /(double) det;


        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * 
                        matrix[1][0]) /(double) det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix)  
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix)  
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)  
    {
        // Create two random matrices of size 3x3
        int[][] matrix1 = createRandomMatrix(3, 3);
        int[][] matrix2 = createRandomMatrix(3, 3);
        
        // Perform matrix addition
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Addition:");
        displayMatrix(sum);
        
        // Perform matrix subtraction
        int[][] difference = subtractMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Subtraction:");
        displayMatrix(difference);
        
        // Perform matrix multiplication
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Multiplication:");
        displayMatrix(product);
        
        // Find the transpose of Matrix 1
        int[][] transpose = transposeMatrix(matrix1);
        System.out.println("\nTranspose of Matrix:");
        displayMatrix(transpose);
        
        // Calculate determinant for a 2x2 matrix 
        int[][] matrix2x2 = {{matrix1[0][0], matrix1[0][1]},
                            {matrix1[1][0], matrix1[1][1]}};

        int det2x2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant of 2x2 Matrix:");
        System.out.println(det2x2);
        
        // Calculate determinant for a 3x3 matrix
        int det3x3 = determinant3x3(matrix1);
        System.out.println("\nDeterminant of 3x3 Matrix:");
        System.out.println(det3x3);
        
        // Calculate inverse of 2x2 matrix
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        if (inverse2x2 != null) {
            System.out.println("\nInverse of 2x2 Matrix:");
            displayMatrix(inverse2x2);
        }
        
        // Calculate inverse of 3x3 matrix
        double[][] inverse3x3 = inverse3x3(matrix1);
        if (inverse3x3 != null) {
            System.out.println("\nInverse of 3x3 Matrix:");
            displayMatrix(inverse3x3);
        }
		
	  // Display the matrices
        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
    }
}