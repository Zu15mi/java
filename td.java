import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in 24-hour format (HH:mm): ");
        String time24 = scanner.nextLine();

        // Format for 24-hour time input
        SimpleDateFormat inputFormat = new SimpleDateFormat("HH:mm");

        // Format for 12-hour time output with AM/PM
        SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm a");

        try {
            // Parse string to Date
            Date date = inputFormat.parse(time24);

            // Format date to 12-hour format
            String time12 = outputFormat.format(date);

            System.out.println("12-hour format: " + time12);
        } catch (ParseException e) {
            System.out.println("Invalid input. Please enter time as HH:mm (e.g. 23:15)");
        }

        scanner.close();
    }
}
