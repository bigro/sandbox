package com.example.sampledomain.application.service;

import com.example.sampledomain.domain.model.guest.Guest;
import com.example.sampledomain.domain.model.member.Member;
import com.example.sampledomain.domain.model.user.User;
import com.example.sampledomain.domain.model.user.UserIdentifier;
import com.example.sampledomain.domain.model.user.UserType;
import com.example.sampledomain.mock.datasource.user.UserDataSourceMockBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    UserService userService;

    @Test
    void 現在がゲストユーザーの場合に会員登録すると通常会員になる() {
        userService = new UserService(UserDataSourceMockBuilder.ゲストユーザーの状態を返すmock());
        User user = userService.user(new UserIdentifier("1"));

        userService.registerMember(Guest.of(user));

        userService = new UserService(UserDataSourceMockBuilder.会員申し込み済み状態を返すmock(user));
        User actual = userService.user(user.identifier());
        assertEquals(UserType.会員, actual.type());
    }

    @Test
    void 現在が通常会員の場合にプレミアム会員登録するとプレミアム会員になる() {
        User guest = User.guest(UserIdentifier.generate());
        userService = new UserService(UserDataSourceMockBuilder.会員申し込み済み状態を返すmock(guest));
        User user = userService.user(new UserIdentifier("1"));

        userService.registerPremium(Member.of(user));

        userService = new UserService(UserDataSourceMockBuilder.プレミアム会員申し込み済み状態を返すmock(user));
        User actual = userService.user(user.identifier());
        assertEquals(UserType.プレミアム会員, actual.type());
    }

    @Test
    void 現在が通常会員の場合に退会するとゲストユーザーになる() {
        User guest = User.guest(UserIdentifier.generate());
        userService = new UserService(UserDataSourceMockBuilder.会員申し込み済み状態を返すmock(guest));
        User user = userService.user(new UserIdentifier("1"));

        userService.leave(Member.of(user));

        userService = new UserService(UserDataSourceMockBuilder.通常会員から退会申し込み済み状態を返すmock(user));
        User actual = userService.user(user.identifier());
        assertEquals(UserType.ゲスト, actual.type());
    }

    @Test
    void 現在がプレミアム会員の場合にプレミアム解除し次月になると通常会員になる() {

    }

    @Test
    void 現在がプレミアム会員の場合にプレミアム解除しても当月の場合はプレミアム会員のまま() {

    }

    @Test
    void 現在がプレミアム会員の場合に退会するとゲストユーザーになる() {

    }
}