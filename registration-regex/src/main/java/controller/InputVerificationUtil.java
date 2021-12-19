package controller;

import static controller.VerificationRegexp.*;
import static view.LocaleConstants.APP_LOCALE;
import static view.TextConstants.*;

public class InputVerificationUtil {

    public static boolean isValid(String property, String propertyName) {
        if (propertyName.equals(NAME)) {
            return isValidName(property);
        } else if (propertyName.equals(LOGIN)) {
            return isValidLogin(property);
        }
        return false;
    }

    private static boolean isValidName(String name) {
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

    private static boolean isValidLogin(String login) {
        return  login.matches(LOGIN_REGEXP);
    }
}
