package controller;

import model.Model;
import model.User;
import view.View;

public class RegistrationController {
    private Model model;
    private View view;
    private InputSource inputSource = new InputSource();


    public RegistrationController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void registerUser() {
        String name = registerName();
        String login = registerLogin();
        User user = new User(name, login);
        view.writeValidInput(user);
    }

    private String registerName() {
        String name = null;
        while (inputSource.ready()) {
            view.requestName();
            name = inputSource.readInput();
            if (!InputVerificationUtil.isValidName(name)) {
                view.writeInvalidNameWarning(name);
            } else {
                break;
            }
        }
        return name;
    }

    private String registerLogin() {
        String login = null;
        while (inputSource.ready()) {
            view.requestLogin();
            login = inputSource.readInput();
            if (!InputVerificationUtil.isValidLogin(login)) {
                view.writeInvalidLoginWarning(login);
            } else {
                break;
            }
        }
        return login;
    }
}
