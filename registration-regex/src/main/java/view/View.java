package view;

import model.User;

public class View {

    public void requestName() {
        System.out.print("Please enter your name!\n");
    }

    public void requestLogin() {
        System.out.print("Please enter your login!\n");
    }

    public void writeInvalidNameWarning(String name) {
        System.out.printf("Sorry, \"%s\" is not a valid name!\n", name);
    }

    public void writeInvalidLoginWarning(String login) {
        System.out.printf("Sorry, \"%s\" is not a valid login! Please, try again!\n", login);
    }

    public void writeValidInput(User user) {
        System.out.printf("Thank you for registration, user %s is saved!\n", user);
    }
}
