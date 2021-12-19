package model.repository;

import model.entity.User;

import java.util.HashSet;

public class UserRepository {
    private static final HashSet<User> users = new HashSet<>();

    static {
        initRepoWithFakeData();
    }

    public static void initRepoWithFakeData() {
        users.add(new User("Adam", "adam_12345"));
        users.add(new User("Eva", "eva_was_here"));
        users.add(new User("Snake", "snake007"));
    }

    public static HashSet<User> getUsers() {
        return new HashSet<>(users);
    }
}
