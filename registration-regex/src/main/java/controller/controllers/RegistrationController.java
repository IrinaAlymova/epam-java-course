package controller.controllers;

import controller.datasources.InputSource;
import controller.util.InputVerificationUtil;
import model.Model;
import model.entity.User;
import model.repository.LoginNotUniqueException;
import view.View;

import java.util.Objects;

import static view.util.TextConstants.*;

public class RegistrationController {
    private Model model;
    private View view;
    private InputSource inputSource = new InputSource();

    public RegistrationController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void registerUser() {
        String name = Objects.requireNonNull(registerName());
        String login = null;
        while (true) {
            try {
                login = Objects.requireNonNull(registerLogin());
            } catch (LoginNotUniqueException e) {
                view.printLoginNotUniqueWarning();
                continue;
            }
            break;
        }
        User user = new User(name, login);
        view.printSuccessfulInputMessage(user);
    }

    private String registerName() {
        String name = null;
        while (true) {
            view.requestInput(NAME);
            name = inputSource.readInput();
            if (!InputVerificationUtil.isValidName(name)) {
                view.printInvalidInputWarning(name);
            } else {
                break;
            }
        }
        return name;
    }

    private String registerLogin() throws LoginNotUniqueException {
        String login = null;
        while (true) {
            view.requestInput(LOGIN);
            login = inputSource.readInput();
            if (!InputVerificationUtil.isValidLogin(login)) {
                view.printInvalidInputWarning(login);
            } else {
                if (!InputVerificationUtil.isUniqueLogin(login)) {
                    throw new LoginNotUniqueException();
                }
                break;
            }
        }
        return login;
    }

}
