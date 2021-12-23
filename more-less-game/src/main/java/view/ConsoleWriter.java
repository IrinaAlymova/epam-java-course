package view;

import java.util.ArrayList;

public class ConsoleWriter {

    public void writeGreeting() { System.out.println("Let's play the guessing game!"); }

    public void requestMinValue() { System.out.println("Please enter min value!"); }

    public void requestMaxValue() { System.out.println("Please enter max value!"); }

    public void requestNumberFromRange(int min, int max) {
        System.out.printf("Please enter the number! The range is [%d, %d] (exclusively)\n", min, max);
    }

    public void writeEmptyInputWarning() {
        System.out.println("Seems like you didn't write anything! Try again!");
    }

    public void writeInvalidRangeWarning() {
        System.out.println("Your range is invalid!");
    }

    public void writeNotValidNumberWarning() {
        System.out.println("This is not a number! Try again!");
    }

    public void writeNumberNotInRangeWarning() {
        System.out.println("This number is not in the range! Try again!");
    }

    public void writeNumberTooBigWarning() {
        System.out.println("The number is too big!");
    }

    public void writeNumberTooSmallWarning() {
        System.out.println("The number is too small!");
    }

    public void writeWinningLines(int winningNumber, ArrayList<Integer> inputs) {
        System.out.printf("That's right, you won! %d is the number I was thinking of!\n", winningNumber);
        System.out.printf("You used %d entries to guess the number!\n", inputs.size());
        System.out.printf("Here's your entries: %s\n", inputs);
    }
}
