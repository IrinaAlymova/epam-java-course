package controller;

import model.GameService;
import view.ConsoleWriter;

public class GameController {
    public ConsoleWriter view;
    public GameService model;
    public InputValidator inputValidator = new InputValidator();
    public InputSource inputSource = new InputSource();

    public GameController() {
        this.view = new ConsoleWriter();
        this.model = new GameService(this, view);
    }

    public void processGame() {
        model.runGame();
    }

    public int requestGuess(int min, int max) {
        String input;
        do {
            view.requestNumberFromRange(min, max);
            input = inputSource.readInput();
        } while (isInputInvalid(input));
        return Integer.parseInt(input);
    }

    public int requestMinValue() {
        String input;
        do {
            view.requestMinValue();
            input = inputSource.readInput();
        } while (isInputInvalid(input));
        return Integer.parseInt(input);
    }

    public int requestMaxValue() {
        String input;
        do {
            view.requestMaxValue();
            input = inputSource.readInput();
        } while (isInputInvalid(input));
        return Integer.parseInt(input);
    }

    public boolean isInputInvalid(String input) {
        if (inputValidator.isEmpty(input)) {
            view.writeEmptyInputWarning();
            return true;
        }
        if (inputValidator.isNotValidNumber(input)) {
            view.writeNotValidNumberWarning();
            return true;
        }
        return false;
    }
}
