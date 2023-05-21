import Exception1.WrongLoginException;
import Exception1.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "qwe_rty_123";
        String password = "d_1hWiKjjP_91155555";
        String confirmPassword = "d_1hWiKjjP_91155555";
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Проверка не пройдена");
        }
    }

    public static  boolean check(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if (!login.matches("^[\\w]{1,20}$")) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches("^[\\w]{19,}$") ||
                !confirmPassword.matches("^[\\w]{19,}$") ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return true;
    }

    }



      /



