// Create a class named HandshakeCalculator to calculate the maximum number of handshakes
import java.util.Scanner;

class HandshakeCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable numberOfStudents and take user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Compute the maximum number of handshakes using the formula (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the number of handshakes
        System.out.println("The maximum number of handshakes among " +
                           numberOfStudents + " students is " + handshakes);
    }
}
