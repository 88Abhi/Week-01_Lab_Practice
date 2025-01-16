import java.util.Scanner;

public class GCDandLCMCalculator 
{

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) 
	{
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b) 
	{
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
