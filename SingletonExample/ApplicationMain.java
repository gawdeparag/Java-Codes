package SingletonExample;

import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {
        while (true) {
            Logging logger = Logging.getLogger();
            logger.log("Application started.");

            Scanner scanner = new Scanner(System.in);

            UserManagement userManagement = UserManagement.getUserManagementInstance();

            System.out.println("Enter a valid username: ");
            String name = scanner.nextLine();

            if (!userManagement.validateUser(name)) {
                logger.log("Invalid user. Please try again.");
            } else {
                logger.log("Valid user. Exiting the program.");
                break;
            }
        }
    }
}
