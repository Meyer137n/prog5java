public class ExtraValueException extends Exception{
    public ExtraValueException() {
    }

    public ExtraValueException(String message) {
        super(message);
    }

    public ExtraValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtraValueException(Throwable cause) {
        super(cause);
    }

    public ExtraValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
