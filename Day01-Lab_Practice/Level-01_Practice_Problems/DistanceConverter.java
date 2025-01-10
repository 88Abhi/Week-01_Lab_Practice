import java.util.Scanner;

class DistanceConverter 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable distanceInFeet and take user input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards and miles
        double yards = distanceInFeet / 3;      // 1 yard = 3 feet
        double miles = yards / 1760;            // 1 mile = 1760 yards

        // Display the distance in feet, yards, and miles
        System.out.println("The distance is " + distanceInFeet + " feet, "
                     + yards + " yards, and " + miles + " miles");                             
		
  // Closing input object after task completion
  input.close();
    }
}
