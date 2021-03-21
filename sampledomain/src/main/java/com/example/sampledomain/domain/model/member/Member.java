package com.example.sampledomain.domain.model.member;

import com.example.sampledomain.domain.model.guest.Guest;
import com.example.sampledomain.domain.model.user.User;

/**
 * 通常会員
 */
public class Member {
    User user;

    private Member(User user) {
        this.user = user;
    }

    public static Member of(User user) {
        if (!user.isMember()) {
            throw new IllegalArgumentException("ユーザー種別が会員ではありません。");
        }

        return new Member(user);
    }

    public User user() {
        return user;
    }
}
