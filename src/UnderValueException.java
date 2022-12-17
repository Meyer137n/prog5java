public class UnderValueException extends Exception {
    public UnderValueException() {
    }

    public UnderValueException(String message) {
        super(message);
    }

    public UnderValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnderValueException(Throwable cause) {
        super(cause);
    }

    public UnderValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
