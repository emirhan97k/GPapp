import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomeScreen {

    public void homeScreen() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("WELCOME TO THE HOPE CLINIC GP SYSTEM 666\n");

        System.out.println("Date and Time: \n" + now.format(formatter));

        System.out.println(); // blank line

        System.out.println("1. New Patient Sign-Up");
        System.out.println("2. Existing Patient Login");
        System.out.println("3. Search for Patient");
        System.out.println("4. Remove Patient");

        System.out.println("5. Exit Safely");

        System.out.print("Please enter your choice: ");
    }
}
