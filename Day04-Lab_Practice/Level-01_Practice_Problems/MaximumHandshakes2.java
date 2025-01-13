// Class to calculate the maximum number of handshakes
import java.util.Scanner; 

class MaximumHandshakes2 
{
    // Method to calculate the maximum number of handshakes using the formula (n * (n - 1)) / 2
    public static int calculateHandshakes(int numberOfStudents) 
	{
        // Apply the formula to compute the number of handshakes
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; 
		
		// Return the no of handshakes
        return handshakes;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Validate input to ensure it's non-negative
        if (numberOfStudents < 0) {
            System.out.println("The number of students cannot be negative.");
        } else {
            // Call the method to calculate the number of handshakes
            int handshakes = calculateHandshakes(numberOfStudents); 

            // Display the number of handshakes
            System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                               " students is: " + handshakes);
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
