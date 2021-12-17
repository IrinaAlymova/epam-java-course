package model;

public class UserModel {
    private String name;
    private String email;

    public UserModel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
