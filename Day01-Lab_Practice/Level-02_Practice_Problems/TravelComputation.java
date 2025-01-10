// Create a class named TravelComputation to calculate total travel distance and time
// based on user inputs for city names, distances, and times.
import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs for travel details.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the traveler's name and store it in a variable.
        System.out.print("Enter the name of the traveler: ");
        String name = input.nextLine();

        // Prompt the user to input the cities (from, via, to) and store them in variables.
        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Prompt the user to input the distance from the starting city to the via city.
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();

        // Prompt the user to input the time taken for the above distance (in minutes).
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = input.nextInt();

        // Prompt the user to input the distance from the via city to the destination city.
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        // Prompt the user to input the time taken for the above distance (in minutes).
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate the total distance and total time for the journey.
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display the total travel details with appropriate labels.
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity +
                           " to " + toCity + " via " + viaCity + " is " + totalDistance +
                           " miles and the Total Time taken is " + totalTime + " minutes.");

        // Close the Scanner object to release resources and avoid memory leaks.
        input.close();
    }
}
