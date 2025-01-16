import java.time.LocalDate; // Import LocalDate for current date
import java.time.format.DateTimeFormatter; // Import formatter for custom formats

public class DateFormatting 
{

    public static void main(String[] args) 
	{
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Original Date: " + currentDate);

        // Format: dd/MM/yyyy
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatted Date (dd/MM/yyyy): " + currentDate.format(format1));

        // Format: yyyy-MM-dd
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Formatted Date (yyyy-MM-dd): " + currentDate.format(format2));

        // Format: EEE, MMM dd, yyyy
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Formatted Date (EEE, MMM dd, yyyy): " + currentDate.format(format3));
    }
}
