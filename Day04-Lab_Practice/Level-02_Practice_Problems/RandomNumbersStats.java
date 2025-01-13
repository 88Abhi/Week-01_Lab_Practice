// Create a class RandomNumbersStats for generating five 4 digit random 
// values and then calculating their average, minimum and maximum value
class RandomNumbersStats 
{
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) 
    {
        // Create an array to store the random numbers
        int[] randomNumbers = new int[size];

        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }

        // Return the generated array
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) 
    {
        // Initialize variables to store the sum, minimum, and maximum
        int sum = 0;
		
	  // Assume the first element is the minimum
        int min = numbers[0]; 
		
	  // Assume the first element is the maximum
        int max = numbers[0]; 

        // Loop through the array to calculate sum, and find min and max
        for (int num : numbers) {
            sum += num; 
			
            if (num < min) {
                min = num;
            }
			
            if (num > max) {
                max = num;
            }
        }

        // Calculate the average by dividing the sum by
        // the number of elements
        double average = (double) sum / numbers.length;

        // Return an array containing the average, minimum, and maximum
        return new double[]{average, min, max};
    }

    public static void main(String[] args) 
    {
        // Assign 5 to the size variable as our array size is 5
        int size = 5;

        // Generate the array of random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find the average, minimum, and maximum values of the array
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the generated random numbers
        System.out.print("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Display the calculated average, minimum, and maximum values
        System.out.println("\nAverage: " + stats[0] + "\nMinimum: " +
                           stats[1] + "\nMaximum: " + stats[2]);
    }
}

