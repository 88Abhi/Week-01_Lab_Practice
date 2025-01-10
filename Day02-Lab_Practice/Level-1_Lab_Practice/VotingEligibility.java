// This program checks whether a person is eligible to vote based on their age.
// A person can vote if their age is 18 or older.
import java.util.Scanner;

class VotingEligibility 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Take the person's age as input.
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Check if the age is greater than or equal to 18.
        if (age >= 18) {
            // Print a message indicating that the person can vote.
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Print a message indicating that the person cannot vote.
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner to release resources.
        input.close();
    }
}
