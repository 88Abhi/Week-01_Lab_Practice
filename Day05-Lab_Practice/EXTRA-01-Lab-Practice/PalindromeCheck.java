import java.util.Arrays;
import java.util.Scanner;

class PalindromeCheck 
{
  // create a method to check isPalindrome the string 
  public static boolean isPalindrome( String textInput ) 
  { 
    // convert the String into array and stored in charArr reference
    char charArr[] = textInput.toCharArray(); 
	
	// Create variable low and high and Intilize the value
	int low = 0 , high = textInput.length() - 1; 
	 
	// Iterate over the charArr and swap the value
	while( low <= high ) 
	{ 
      
	  // check the value if same then continue 
	  if( charArr[low] != charArr[high] ) return false;
	  
	  
	  // Increment the low by 1
	  low++; 
	  
	  // Decrement the high by 1
	  high --;
	} 
	
	// return true because string is palindrome
	return true;
  
  }
  public static void main( String args[]) 
  {
     // Create scanner object naem as input
	   Scanner input = new Scanner (System.in);  
	   
	   // Create a String variable to take user input  
	   // nextLine is used to take String input 
	   System.out.print("Enter a textInput : ");
	   String textInput = input.nextLine();  
	   
	   // Create a variable resultStatus and store the value of isPalindrome
	   // make call of isPalindrome
	   boolean resultStatus = isPalindrome( textInput ); 
	   
	   // Display the result 
	   System.out.println( textInput +" String is palindrome : " + resultStatus); 
	   
	   // closing the scanner object and release the resource 
	   input.close();
  
  
  }


}