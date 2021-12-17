package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSource {
    public static final BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() {
        try {
            return consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

