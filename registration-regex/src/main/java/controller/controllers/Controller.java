package controller.controllers;

import model.Model;
import model.repository.LoginNotUniqueException;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserRegistration() {
        RegistrationController registrationController = new RegistrationController(model, view);
        registrationController.registerUser();
    }
}
