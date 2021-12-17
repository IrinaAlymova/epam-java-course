package controller;

public class NameVerificationUtil {
    public static final String ENGLISH_REGEX = "[a-zA-Z-]+";

    public static boolean isValidInput(String input) {
        return input.matches(ENGLISH_REGEX);
    }
}
