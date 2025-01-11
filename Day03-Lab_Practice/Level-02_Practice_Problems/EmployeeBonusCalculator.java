// EmployeeBonusCalculator Class calculates the bonus, new salary, and 
// total payout for 10 employees based on their years of service and current salaries.
import java.util.Scanner;

class EmployeeBonusCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for user input. 
        Scanner input = new Scanner(System.in);

        // Declare arrays to store salaries, years of service, bonuses, and new salaries.
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to calculate total bonus, total old salaries, and total new salaries.
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take input for salaries and years of service.
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for Employee " + (i + 1) + ": ");
            double salary = input.nextDouble();

            // Validate salary input it must be positive.
            if (salary <= 0) {
                System.err.println("Invalid salary. Please enter a positive number.");
                i--; // Decrement index to retry the input.
                continue;
            }

            System.out.print("Enter years of service for Employee " + (i + 1) + ": ");
            double service = input.nextDouble();

            // Validate years of service it must be non-negative.
            if (service < 0) {
                System.err.println("Invalid years of service. Please enter a non-negative number.");
                i--; // Decrement index to retry the input.
                continue;
            }

            // Store valid inputs in the respective arrays.
            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        // Loop to calculate bonuses, new salaries, and totals.
        for (int i = 0; i < 10; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02; // Bonus rate based on years of service.
            bonuses[i] = salaries[i] * bonusRate; // Calculate bonus.
            newSalaries[i] = salaries[i] + bonuses[i]; // Calculate new salary.

            // Update totals for old salaries, bonuses, and new salaries.
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results for each employee.
        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                               ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        // Display total bonus, old salary, and new salary payouts.
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner object to release resources.
        input.close();
    }
}
