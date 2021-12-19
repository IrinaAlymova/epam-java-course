package controller;

import static controller.VerificationRegexp.*;

public class InputVerificationUtil {

    public static boolean isValidName(String name) {

        return  name.matches(EN_NAME_REGEXP) ||
                name.matches(UA_NAME_REGEXP) ||
                name.matches(RU_NAME_REGEXP);
    }

    public static boolean isValidLogin(String login) {

        return  login.matches(LOGIN_REGEXP);
    }
}
