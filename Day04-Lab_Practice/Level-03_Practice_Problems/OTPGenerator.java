// A program to generate a six-digit OTP number
import java.util.HashSet;
import java.util.Random;

class OTPGenerator 
{
    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() 
    {
	  // Generate a random number between 100000 and 999999
	  int otp = 100000 + (int) (Math.random() * 900000);
        return otp; 
    }

    // Method to ensure that the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) 
    {
        // Create a hashset to check unique otps
        HashSet<Integer> uniqueSet = new HashSet<>();
		
	  // If the OTP already exists in the set, return false
        for (int otp : otps) {
            if (!uniqueSet.add(otp)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) 
    {
        // Array to store 10 generated OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs and save them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the generated OTPs are unique
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found! OTPs are not unique.");
        }
    }
}