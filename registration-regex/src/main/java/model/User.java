package model;

import java.util.Objects;

public class User {
    private String name;
    private String login;

    public User(String name, String login) {
        this.name = Objects.requireNonNull(name);
        this.login = Objects.requireNonNull(login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!obj.getClass().equals(this.getClass())) return false;
        User user = (User) obj;
        return Objects.equals(this.name, user.name) && Objects.equals(this.login, user.login);
    }

    @Override
    public String toString() {
        return String.format("name: %s, login: %s", this.name, this.login);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }
}
