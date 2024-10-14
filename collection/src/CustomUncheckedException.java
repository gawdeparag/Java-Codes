public class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException() {
        super();
    }

    public CustomUncheckedException(String message) {
        super(message);
    }

    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
