import java.util.Arrays;
import java.util.Scanner;

class CheckAnagrams 
{

    // Method to check if two strings are anagrams.
    public static boolean areAnagrams(String str1, String str2) 
	{
        // Convert both strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted arrays are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Call the method to check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);

        // Display the result
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Close the Scanner object
        sc.close();
    }
}
