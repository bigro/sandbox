package com.example.sampledomain.domain.model.guest;

import com.example.sampledomain.domain.model.user.User;

/**
 * ゲストユーザー
 */
public class Guest {
    User user;

    private Guest(User user) {
        this.user = user;
    }

    // ゲストは履歴などを保持する必要がないので毎回新しく生成される
    public static Guest genarate() {
        return new Guest(User.generateGuest());
    }
}
