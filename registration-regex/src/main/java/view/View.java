package view;

import model.entity.User;

import java.util.ResourceBundle;
import static view.util.TextConstants.*;
import static view.util.LocaleConstants.*;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, APP_LOCALE);

    public void printMessage(String message){
        System.out.println(message);
    }

    public String getConcatenatedString(String... partsOfString){
        StringBuilder concatString = new StringBuilder();
        for (String partOfString : partsOfString) {
            concatString.append(partOfString);
        }
        return concatString.toString();
    }

    public void requestInput(String typeOfInput) {
        printMessage(getConcatenatedString(
                bundle.getString(INPUT_REQUEST),
                bundle.getString(typeOfInput)
        ));
    }

    public void printInvalidInputWarning(String input) {
        printMessage(String.format(bundle.getString(INPUT_INVALID_WARNING), input));
    }

    public void printLoginNotUniqueWarning() {
        printMessage(bundle.getString(LOGIN_NOT_UNIQUE_WARNING));
    }

    public void printSuccessfulInputMessage(User user) {
        printMessage(String.format(bundle.getString(REGISTRATION_SUCCESS), user));
    }
}
