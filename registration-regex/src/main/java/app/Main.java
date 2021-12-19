package app;

public class Main {

    public static void main(String[] args) {
        String UA_NAME_REGEXP = "^[А-ЩЮЯҐЄІЇа-щьюяґєії'-]{1,20}$";
        System.out.println("dsjkhfksdj".matches(UA_NAME_REGEXP));
    }
}
