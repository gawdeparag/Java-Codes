package SingletonExample;

import java.io.IOException;

// Singleton class declaration using "Static Inner Class method (Bill Pugh Pattern)"
public class UserManagement {

    // A private constructor
    private UserManagement() {}

    // A Helper class
    private static class Helper {
        private static final UserManagement userManagementInstance = new UserManagement();
    }

    // A public static method to return the instance
    public static UserManagement getUserManagementInstance() {
        return Helper.userManagementInstance;
    }

    Logging logger = Logging.getLogger();

    public boolean validateUser(String name) {
        try {
            String[] userCheckCommand = {"/bin/bash", "-c", "id -u \"" + name + "\" >/dev/null 2>&1"};

            Process process = Runtime.getRuntime().exec(userCheckCommand);

            int exitCode = process.waitFor();
            logger.log("Exit code of the process: "+exitCode);

            return exitCode==0;
        } catch (Exception exception) {
            logger.log("Exception occurred: "+exception);
            return false;
        }
    }
}
