package com.example.sampledomain.domain.model.user;

/**
 * ユーザー
 */
public class User {
    UserIdentifier identifier;
    UserType type;

    public User(UserIdentifier identifier, UserType type) {
        this.identifier = identifier;
        this.type = type;
    }

    public static User generateGuest() {
        return new User(UserIdentifier.generate(), UserType.ゲスト);
    }

    public static User of(UserType type) {
        return new User(UserIdentifier.generate(), type);
    }

    public UserType type() {
        return type;
    }
}
