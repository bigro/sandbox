package com.example.sampledomain.domain.model.user;

/**
 * ユーザー種別
 */
public enum UserType {
    プレミアム会員, 会員, ゲスト;

    public boolean isGuest() {
        return this == UserType.ゲスト;
    }
}
