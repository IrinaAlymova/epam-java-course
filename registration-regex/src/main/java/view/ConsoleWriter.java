package view;

import model.UserModel;

public class ConsoleWriter {

    public void requestInput() {
        System.out.printf("Please enter your name!\n");
    }

    public void writeInvalidInputWarning(String input) {
        System.out.printf("Sorry, \"%s\" is not a valid input! Please, try again!\n");
    }

    public void writeValidInput(UserModel user) {
        System.out.printf("Thank you for registration, user %s is saved\n", user);
    }
}
