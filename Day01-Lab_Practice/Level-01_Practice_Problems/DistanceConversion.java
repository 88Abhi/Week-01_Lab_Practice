// Create a class named DistanceConversion to convert dinstance from kilometers to miles

class DistanceConversion
{
	public static void main(String[] args)
	{
		// Create a variable distanceInKiloMeters to 
        // store the distance in kilometers
		double distanceInKiloMeters = 10.8;
		
		// Define the conversion factor from kilometers to miles
		double conversionFactor = 0.6;
		
		// Create a variable distanceInMiles to Calculate 
            // the distance in miles	
		double distanceInMiles = distanceInKiloMeters *
                                     conversionFactor;                       
		
		// Display the converted distance
            System.out.println("The distance " + distanceInKiloMeters +
                           " km in miles is " + distanceInMiles);
	}
}
