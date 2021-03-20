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

    public static User guest(UserIdentifier identifier) {
        return new User(identifier, UserType.ゲスト);
    }

    public UserType type() {
        return type;
    }

    public UserIdentifier identifier() {
        return identifier;
    }

    public boolean isGuest() {
        return type.isGuest();
    }
}
