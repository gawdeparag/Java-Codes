package SingletonExample;

import java.io.*;
import java.time.LocalDateTime;

// Singleton class declaration using "Basic Singleton (Lazy) initialization"
public class Logging {
    // A private static instance
    private static Logging logger;

    private BufferedWriter writer;

    // A private constructor
    private Logging() {
        try {
            writer = new BufferedWriter(new FileWriter("SingletonExample/application.log", true)); // Append mode
            writer.write("Log file created at " + LocalDateTime.now() + "\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Failed to create log file: " + e.getMessage());
        }
    }

    // A public static method to return the instance
    public static synchronized Logging getLogger() {
        if (logger == null) {
            logger = new Logging();
        }
        return logger;
    }

    // Method to log messages
    public void log(String message) {
        try {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }
}
