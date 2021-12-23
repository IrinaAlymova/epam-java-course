package controller;

public class InputValidator {
    public boolean isEmpty(String str) {
        return str.equals("");
    }

    public boolean isNotValidNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}
