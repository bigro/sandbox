package com.example.sampledomain.domain.model.guest;

import com.example.sampledomain.domain.model.user.User;
import com.example.sampledomain.domain.model.user.UserIdentifier;

/**
 * ゲストユーザー
 */
public class Guest {
    User user;

    private Guest(User user) {
        this.user = user;
    }

    // ゲストは履歴などを保持する必要がないので毎回新しく生成される
    public static Guest generate() {
        return new Guest(User.guest(UserIdentifier.generate()));
    }

    public static Guest of(User user) {
        if (!user.isGuest()) {
            throw new IllegalArgumentException("ユーザー種別がゲストではありません。");
        }

        return new Guest(user);
    }

    public User user() {
        return user;
    }
}
