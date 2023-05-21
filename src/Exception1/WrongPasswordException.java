package Exception1;

public class WrongPasswordException extends Throwable  {
    private String detail;

    public WrongPasswordException() {
        detail = "Incorrect password";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
