package controller;

import model.Randomizer;
import view.ConsoleWriter;

import static model.Randomizer.*;

import java.util.ArrayList;

public class MoreLessGameController {
    public static ConsoleWriter consoleWriter = new ConsoleWriter();
    public static Randomizer randomizer = new Randomizer();
    public static InputValidator inputValidator = new InputValidator();
    public static InputSource inputSource = new InputSource();

    public static void main(String[] args) {
        int randomNumber = randomizer.rand();
        int min = RAND_MIN;
        int max = RAND_MAX;
        boolean gameOver = false;
        ArrayList<Integer> inputs = new ArrayList<>();

        while (!gameOver) {
            consoleWriter.requestNumberFromRange(min, max);
            String input = inputSource.readInput();

            if (inputValidator.isEmpty(input)) {
                consoleWriter.writeEmptyInputWarning();
                continue;
            }
            if (inputValidator.isNotValidNumber(input)) {
                consoleWriter.writeNotValidNumberWarning();
                continue;
            }
            int number = Integer.parseInt(input);
            if (inputValidator.numberIsNotInTheRange(number, min, max)) {
                consoleWriter.writeNumberNotInRangeWarning();
                continue;
            }
            inputs.add(number);
            if (number > randomNumber) {
                consoleWriter.writeNumberTooBigWarning();
                max = number - 1;
            } else if (number < randomNumber) {
                consoleWriter.writeNumberTooSmallWarning();
                min = number + 1;
            } else {
                gameOver = true;
                consoleWriter.writeWinningLines(number, inputs);
            }
        }
    }

}
