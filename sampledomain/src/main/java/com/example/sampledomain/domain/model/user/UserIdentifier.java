package com.example.sampledomain.domain.model.user;

import java.util.UUID;

/**
 * ユーザーID
 */
public class UserIdentifier {
    private String value;

    public UserIdentifier(String value) {
        this.value = value;
    }

    public static UserIdentifier generate() {
        return new UserIdentifier(UUID.randomUUID().toString());
    }
}
