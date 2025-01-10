// Create a class named EmployeeBonus to calculate the bonus of employees
// based on their years of service and salary.
import java.util.Scanner;

class EmployeeBonus 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input for salary and years of service.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the employee's salary.
        System.out.print("Enter the employee's salary (in INR): ");
        double salary = input.nextDouble();

        // Prompt the user to enter the employee's years of service.
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        // Check if the years of service are greater than 5 to determine bonus eligibility.
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary.
            double bonus = salary * 0.05;

            // Display the bonus amount.
            System.out.println("The employee is eligible for a bonus of INR " + bonus + ".");
        } else {
            // Display a message if the employee is not eligible for a bonus.
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
