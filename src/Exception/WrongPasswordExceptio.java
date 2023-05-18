package Exception;

public class WrongPasswordExceptio extends Exception{

    public WrongPasswordExceptio(String message) {
        super(message);
    }

    public WrongPasswordExceptio(String message, Throwable cause) {
        super(message, cause);
    }
}
