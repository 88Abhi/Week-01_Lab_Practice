// Create a class named VolumeOfEarth to calculate Earth's 
// volume in km^3 and miles^3
class VolumeOfEarth 
{
    public static void main(String[] args) 
    {
        // Define the radius of Earth in kilometers
        double radiusInKm = 6378;

        // Calculate Earth's volume using the formula (4/3) * pi * r^3
        double volumeInKmCube = (4.0 / 3) * Math.PI * 
                                Math.pow(radiusInKm, 3);

        // Convert the volume to cubic miles (1 mile = 1.60934 km)
        double radiusInMiles = radiusInKm / 1.60934;

        // Calculate Earth's volume using the formula (4/3) * pi * r^3
        double volumeInMilesCube = (4.0 / 3) * Math.PI *    
                                   Math.pow(radiusInMiles, 3);

        // Display the volume in km^3 and miles^3
        System.out.println("The volume of Earth in cubic kilometers is " + 
                           volumeInKmCube + " and in cubic miles is " + 
                           volumeInMilesCube);
    }
}