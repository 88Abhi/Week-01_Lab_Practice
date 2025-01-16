import java.time.LocalDate; // Import LocalDate class

public class DateArithmetic
 {

    public static void main(String[] args) 
	{
        // Take a sample date (for demonstration purposes)
        LocalDate initialDate = LocalDate.of(2023, 1, 1);
        System.out.println("Initial Date: " + initialDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = initialDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks from the result
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After Subtracting 3 weeks: " + finalDate);
    }
}
