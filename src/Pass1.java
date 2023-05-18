public interface Pass1 {
    boolean validatePassword(String password, String confirmPassword)
            throws Pass1.WrongLoginException, Pass1.WrongPasswordException;

    class WrongPasswordException extends Exception {
    }

    class WrongLoginException extends Exception {
    }
}
