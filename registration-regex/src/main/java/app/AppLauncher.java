package app;

import controller.controllers.Controller;
import model.Model;
import view.View;

public class AppLauncher {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUserRegistration();
    }
}
