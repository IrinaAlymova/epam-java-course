package app;

import controller.GameController;

public class AppLauncher {
    public static void main(String[] args) {
        GameController moreLessGameController = new GameController();
        moreLessGameController.processGame();
    }
}
