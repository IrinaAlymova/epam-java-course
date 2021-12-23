package controller;

import model.Model;
import model.entity.User;
import model.entity.LoginNotUniqueException;
import model.entity.UserRepository;
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
        String name = Objects.requireNonNull(obtainName());
        String login = Objects.requireNonNull(obtainLogin());
        User user;
        while (true) {
            try {
                user = new User(name, login);
                break;
            } catch (LoginNotUniqueException e) {
                view.printLoginNotUniqueWarning();
            }
        }
        UserRepository.addUser(user);
        view.printSuccessfulInputMessage(user);
    }

    private String obtainName() {
        String name;
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

    private String obtainLogin() {
        String login;
        while (true) {
            view.requestInput(LOGIN);
            login = inputSource.readInput();
            if (!InputVerificationUtil.isValidLogin(login)) {
                view.printInvalidInputWarning(login);
            } else {
                break;
            }
        }
        return login;
    }

}
