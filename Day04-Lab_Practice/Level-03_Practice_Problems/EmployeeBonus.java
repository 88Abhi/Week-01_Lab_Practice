// A class EmployeeBonus to find the bonus of 10 employees based on their years of service
import java.util.Random;

class EmployeeBonus 
{
    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeData() 
	{
		// 2D array to store salary and years of service
        Random rand = new Random();
        double[][] employeeData = new double[10][2];  
        
        for (int i = 0; i < 10; i++) {
            // Generating a 5-digit salary for each employee
            employeeData[i][0] = rand.nextInt(90000) + 10000;
            
            // Generating random years of service
            employeeData[i][1] = rand.nextInt(20) + 1;
        }
        
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on the years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) 
	{
		// 2D array to store new salary, bonus, and old salary
        double[][] updatedData = new double[10][3];  
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            
            // Calculate bonus based on years of service
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            
            // Calculate new salary
            double newSalary = oldSalary + bonus;
            
            // Storing the results in updatedData array
            updatedData[i][0] = oldSalary;  
            updatedData[i][1] = newSalary;  
            updatedData[i][2] = bonus;      
        }
        
        return updatedData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static double[] calculateTotalAmount(double[][] updatedData) 
	{
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }
        // Return array of sums
        return new double[] { totalOldSalary, totalNewSalary, totalBonus };
    }

    // Method to print the results in a tabular format
    public static void printResults(double[][] updatedData, double[] totalAmount)
	{
        System.out.print("\nEmployee" + "\tOld Salary" + "\tNew Salary" + "\tBonus");
        
        // Printing the employee-wise data
        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + (i + 1) + "\t\t" + updatedData[i][0] + "\t\t" +
			updatedData[i][1] + "\t\t" + updatedData[i][2]);
        }
        
        // Printing the totals
        System.out.print("\nTotal Old Salary: " + totalAmount[0]);
        System.out.print("\nTotal New Salary: " + totalAmount[1]);
        System.out.print("\nTotal Bonus: " + totalAmount[2]);
    }

    public static void main(String[] args) 
	{
        // Generate employee data 
        double[][] employeeData = generateEmployeeData();
        
        // Calculate new salary and bonus for each employee
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        
        // Calculate total old salary, new salary, and total bonus
        double[] totalAmount = calculateTotalAmount(updatedData);
        
        // Print the results in a tabular format
        printResults(updatedData, totalAmount);
    }
}
