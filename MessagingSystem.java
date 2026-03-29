import java.util.*;

public class MessagingSystem {
    public void displayMenu() {
        System.out.println("//// Welcome to the Patient Messaging System!" +
        "1) Send Message\n" +
        "2) Check Inbox\n" +
        "3) Check Starred Messages\n" +
        "4) Cancel\n");
    }

    public void initializeMsgSystem() {
        Scanner input = new Scanner(System.in);

        int terminated = 0;

        while (terminated != 1) {
            displayMenu();
            System.out.println("Please select an option (number) available: ");
            int selectedChoice = Integer.parseInt(input.nextLine());

            switch (selectedChoice) {
                case 1:
                    // Sending message
                case 2:
                    // Checking inbox
                case 3:
                    // Checking starred messages
                case 4:
                    System.out.println("Goodbye!");
                    terminated = 1;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
