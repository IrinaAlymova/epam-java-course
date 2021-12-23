package model;

import controller.GameController;
import view.ConsoleWriter;
import java.util.ArrayList;
import static model.GameConstants.*;

public class GameService {
    private final GameController controller;
    private final ConsoleWriter view;
    private final Randomizer randomizer = new Randomizer();

    private int min = RAND_MIN;
    private int max = RAND_MAX;
    int randomNumber;
    private ArrayList<Integer> inputs = new ArrayList<>();

    public GameService(GameController controller, ConsoleWriter view) {
        this.controller = controller;
        this.view = view;
    }

    public void runGame() {
        boolean gameOver = false;
        view.writeGreeting();
        min = controller.requestMinValue();
        max = controller.requestMaxValue();
        if (isRangeInvalid(min, max)) {
            view.writeInvalidRangeWarning();
            randomNumber = randomizer.getRandomNumber();
            min = RAND_MIN;
            max = RAND_MAX;
        } else {
            randomNumber = randomizer.getRandomNumber(min, max);
        }

        while (!gameOver) {
            int number = controller.requestGuess(min, max);

            if (!isNumberInRange(number)) {
                view.writeNumberNotInRangeWarning();
                continue;
            }

            inputs.add(number);

            if (isNumberWinning(number)) {
                gameOver = true;
                view.writeWinningLines(number, inputs);
            }
        }
    }

    private boolean isNumberInRange(int number) {
        return number > min && number < max;
    }

    private boolean isNumberWinning(int number) {
        if (number > randomNumber) {
            view.writeNumberTooBigWarning();
            max = number;
            return false;
        } else if (number < randomNumber) {
            view.writeNumberTooSmallWarning();
            min = number;
            return false;
        } else {
            return true;
        }
    }

    private boolean isRangeInvalid(int min, int max) {
        return max - min < 2;
    }
}
