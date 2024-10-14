public class CustomCheckException extends RuntimeException{
    public CustomCheckException() {
        super();
    }

    public CustomCheckException(String message) {
        super(message);
    }

    public CustomCheckException(String message, Throwable cause) {
        super(message, cause);
    }
}
