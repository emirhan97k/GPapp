import java.util.Scanner;

public class GPSystem {

    public static void main(String[] args) {
        GPSystem system = new GPSystem(); // <classname> objectName = new <classname>(); 
        Scanner input = new Scanner(System.in);


        int choice = 0; // Initialize choice with a default value
        do {
            // Create an instance of the homeScreen class and call its homeScreen method
            HomeScreen homeScreenObj = new HomeScreen();
            homeScreenObj.homeScreen();

            try {
                choice = input.nextInt();  // Read user input
                system.handleMenuChoice(choice);  // Handle the user's choice
            } catch (Exception e) {
                System.out.println("Error: Invalid input.");
                input.nextLine(); // Consume the invalid input
                System.exit(0); // Exit the program
            }
        } while (choice != 5);  // Loop until user chooses to exit

        input.close();
    }

    // Method to handle menu choices
    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("New Patient Sign-Up");
                // Call method to handle new patient sign-up
                break;
            case 2:
                System.out.println("Existing Patient Login");
                // Call method to handle patient login
                break;
            case 3:
                System.out.println("Search for Patient");
                // Call method to handle patient search
                break;
            case 4:
                System.out.println("Remove Patient");
                // Call method to remove patient
                break;
            case 5:
                System.out.println("Exiting safely...");
                // Call method to save data and exit safely if necessary
                break;
            default:
                System.out.println("Invalid, please try again.");
                break;
        }
    }
}
