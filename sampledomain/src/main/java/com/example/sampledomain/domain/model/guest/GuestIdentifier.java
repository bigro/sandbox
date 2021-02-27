package com.example.sampledomain.domain.model.guest;

import java.util.UUID;

/**
 * ゲストID
 */
public class GuestIdentifier {
    String value;

    private GuestIdentifier(String value) {
        this.value = value;
    }

    public static GuestIdentifier generate() {
        return new GuestIdentifier(UUID.randomUUID().toString());
    }
}
