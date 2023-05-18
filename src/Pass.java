public class Pass {
    String password;
    String confirmPassword;

    public Pass(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
