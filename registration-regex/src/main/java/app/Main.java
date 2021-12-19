package app;

import static controller.VerificationRegexp.*;
import static view.TextConstants.*;
import static view.LocaleConstants.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("ivy_ray".matches(LOGIN_REGEXP));
    }
}
