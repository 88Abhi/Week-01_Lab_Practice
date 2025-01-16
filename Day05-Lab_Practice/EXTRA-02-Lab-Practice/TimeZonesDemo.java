import java.time.ZonedDateTime;
import java.time.ZoneId; // Import ZoneId class for time zones
import java.time.format.DateTimeFormatter; // Import for formatted output

public class TimeZonesDemo 
{

    public static void main(String[] args)
	{
        // Get current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        // Get current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        // Get current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);

        // Display formatted time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy hh:mm:ss a z");
        System.out.println("\nFormatted Times:");
        System.out.println("GMT: " + gmtTime.format(formatter));
        System.out.println("IST: " + istTime.format(formatter));
        System.out.println("PST: " + pstTime.format(formatter));
    }
}
