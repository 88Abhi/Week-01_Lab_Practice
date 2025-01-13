import java.util.Scanner; 

// Class to calculate the maximum number of handshakes among students
class MaximumHandshakes 
{
    // Method to calculate maximum handshakes using the formula (n * (n - 1)) / 2
    public static int calculateHandshakes(int students) 
	{
        // Calculates the total number of unique handshakes
		int handshakes = (students * (students - 1)) / 2;
		
		// Return the result 
        return handshakes;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt(); 

        // Call the method to calculate the maximum handshakes
        int maxHandshakes = calculateHandshakes(students); 

        // Display the result to the user
        System.out.println("The maximum number of handshakes possible among " + students + 
                           " students is: " + maxHandshakes);

        // Close the Scanner object to release resources
        sc.close();
    }
}
