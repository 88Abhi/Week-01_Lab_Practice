// Create AgeComputation Class to compute the Age

class AgeComputation
{
	public static void main(String[] args)
	{		
		// Create a variable name to indicate the person 
            // whose age will be calculated.
		String name = "Harry";
		
		// Create a variable birthYear and currentYear to indicate 
            // the person's Birth Year and Current Year.
		int birthYear = 2000, currentYear = 2024;
		
		// Create a variable currentAge to indicate
            // the person's Current age.
		int currentAge = currentYear - birthYear;
		
		// Printing the details of age
		System.out.println(name + "'s age in " + currentYear +
                               " is " + currentAge);
	}
}