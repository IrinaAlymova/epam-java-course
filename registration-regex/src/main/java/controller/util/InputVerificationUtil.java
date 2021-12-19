package controller.util;

import model.entity.User;
import model.repository.UserRepository;

import java.util.HashSet;

import static controller.util.VerificationRegexp.*;
import static view.util.LocaleConstants.APP_LOCALE;
import static view.util.TextConstants.*;

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

    public static boolean isUniqueLogin(String login) {
        HashSet<User> users = UserRepository.getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
}
