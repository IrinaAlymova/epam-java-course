package model.entity;

import model.entity.User;

import java.util.HashSet;

public class UserRepository {
    private static final HashSet<User> users = new HashSet<>();

    static {
        initRepoWithFakeData();
    }

    private static void initRepoWithFakeData() {
        try {
            users.add(new User("Adam", "adam_12345"));
            users.add(new User("Eva", "eva_was_here"));
            users.add(new User("Snake", "snake007"));
        } catch (LoginNotUniqueException e) {
            e.printStackTrace();
        }
    }

    public static HashSet<User> getUsers() {
        return new HashSet<>(users);
    }

    public static boolean isUniqueLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return false;
            }
        }
        return true;
    }

    public static void addUser(User user) {
        users.add(user);
    }


}
