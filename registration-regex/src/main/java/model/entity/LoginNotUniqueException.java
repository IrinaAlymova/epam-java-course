package model.entity;

public class LoginNotUniqueException extends Exception {
    private String duplicateLogin;

    public String getDuplicateLogin() {
        return duplicateLogin;
    }

    public LoginNotUniqueException(String message, String duplicateLogin) {
        super(message);
        this.duplicateLogin = duplicateLogin;
    }
}
