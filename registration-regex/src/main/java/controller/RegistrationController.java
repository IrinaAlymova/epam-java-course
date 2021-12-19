package controller;

import model.Model;
import model.User;
import view.View;

import java.util.Objects;

import static view.TextConstants.*;

public class RegistrationController {
    private Model model;
    private View view;
    private InputSource inputSource = new InputSource();

    public RegistrationController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void registerUser() {
        String name = Objects.requireNonNull(registerProperty(NAME));
        String login = Objects.requireNonNull(registerProperty(LOGIN));
        User user = new User(name, login);
        view.printSuccessfulInputMessage(user);
    }

    private String registerProperty(String propertyName) {
        String property = null;
        while (true) {
            view.requestInput(propertyName);
            property = inputSource.readInput();
            if (!InputVerificationUtil.isValid(property, propertyName)) {
                view.printInvalidInputWarning(propertyName, property);
            } else {
                break;
            }
        }
        return property;
    }
}
