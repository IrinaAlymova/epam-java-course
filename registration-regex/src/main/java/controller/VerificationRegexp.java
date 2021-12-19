package controller;

public interface VerificationRegexp {
    String EN_NAME_REGEXP = "^[A-Za-z-]{1,20}$";
    String UA_NAME_REGEXP = "^[А-ЩЮЯҐЄІЇa-щьюяґєії'-]{1,20}$";
    String RU_NAME_REGEXP = "^[А-ЯЁa-яё-]{1,20}$";
    String LOGIN_REGEXP = "^[A-Za-z0-9-_]{8,20}$";
}
