package model;

import java.util.Random;
import static model.GameConstants.*;

public class Randomizer {

    public int getRandomNumber(int min, int max) {
        int randomNum = new Random().nextInt(max - min - 1) + 1;
        return min + randomNum;
    }

    public int getRandomNumber() {
        return getRandomNumber(RAND_MIN, RAND_MAX);
    }
}
