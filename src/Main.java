import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        mainLogin();
        mainPasswordConfirmPassword();

         }

    public static void mainLogin(){
            String login = "java_skypro_go123";
            Pattern patternLogin = Pattern.compile("^[\\w]{1,20}$");
            Matcher matcher = patternLogin.matcher(login);
            boolean found = matcher.find();
            if (found) {
                System.out.println("Все ок!");
            } else {
                try {
                    throw new Exception("WrongLoginException");
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                        System.out.println("Проверка завершена");
                    }
                }
            }


    public static void  mainPasswordConfirmPassword() {
        String password = "d_1hWiKjjP_91155555";
        String confirmPassword = "d_1hWiKjjP_91155";
        Pattern patternZP = Pattern.compile("^[\\w]{19,}$");
        Matcher matcher = patternZP.matcher(password);
        Matcher matcher1 = patternZP.matcher(confirmPassword);
        boolean found = matcher.find();
        boolean found1 = matcher.find();
        Pass password0 = new Pass("d_1hWiKjjP_911", "d_1hWiKjjP_911");
        // if ((!password.matches("^[\\w]{19,}$")) || (!confirmPassword.matches("^[\\w]{19,}$"))) ;
        if (found && found1) {
            System.out.println("Все ок!");
        } else {
            try {
                throw new Exception("WrongLoginException");
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Проверка завершена");
            }
        }

    }
}




