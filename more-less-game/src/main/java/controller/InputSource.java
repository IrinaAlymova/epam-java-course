package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static controller.MoreLessGameController.consoleWriter;

public class InputSource {
    public static final BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public String readLine() {
        try {
            return consoleReader.readLine();
        } catch (IOException e) {
            consoleWriter.writeIOExceptionWarning();
        }
        return null;
    }

}
