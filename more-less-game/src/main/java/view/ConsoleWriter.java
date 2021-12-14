package view;

import java.util.ArrayList;

public class ConsoleWriter {
    public void requestNumberFromRange(int min, int max) {
        System.out.printf("Please enter the number! The range is [%d, %d]\n", min, max);
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
        System.out.printf("Here's your entries: %s", inputs);
    }

    public void writeIOExceptionWarning() {
        System.out.println("Something went wrong with the input");
    }
}
