package controller;

public class InputValidator {
    public boolean isValidNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean numberInTheRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}
