package controller;

import static controller.VerificationRegexp.*;
import static view.LocaleConstants.APP_LOCALE;

public class InputVerificationUtil {

    public static boolean isValidName(String name) {
        String localeName = APP_LOCALE.getCountry();
        switch (localeName) {
            case "EN":
                return name.matches(EN_NAME_REGEXP);
            case "UA":
                return name.matches(UA_NAME_REGEXP);
            case "RU":
                return name.matches(RU_NAME_REGEXP);
        }
        return false;
    }

    public static boolean isValidLogin(String login) {
        return  login.matches(LOGIN_REGEXP);
    }
}
