package com.example.sampledomain.domain.model.guest;

/**
 * ゲストユーザー
 */
public class Guest {
    GuestIdentifier identifier;

    private Guest(GuestIdentifier identifier) {
        this.identifier = identifier;
    }

    // ゲストは履歴などを保持する必要がないので毎回IDが新しく生成される
    public static Guest genarate() {
        return new Guest(GuestIdentifier.generate());
    }
}
