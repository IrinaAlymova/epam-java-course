package controller;

import model.UserModel;
import view.ConsoleWriter;

public class RegistrationController {
    static ConsoleWriter consoleWriter = new ConsoleWriter();
    static InputSource inputSource = new InputSource();

    public static void main(String[] args) {
        consoleWriter.requestInput();
        String input = inputSource.readInput();
        if (!NameVerificationUtil.isValidInput(input)) {
            consoleWriter.writeInvalidInputWarning(input);
        }
        UserModel user = new UserModel(input);
        consoleWriter.writeValidInput(user);
    }
}
