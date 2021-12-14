package model;

import java.util.Random;

public class Randomizer {
    public static final int RAND_MIN = 0;
    public static final int RAND_MAX = 100;

    public int rand(int min, int max) {
        int randomNum = new Random().nextInt(max - min + 1);
        return min + randomNum;
    }

    public int rand() {
        return rand(RAND_MIN, RAND_MAX);
    }
}
