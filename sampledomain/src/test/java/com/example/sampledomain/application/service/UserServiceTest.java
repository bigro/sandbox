package com.example.sampledomain.application.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Test
    void 現在がゲストユーザーの場合に会員登録すると通常会員になる() {

    }

    @Test
    void 現在が通常会員の場合にプレミアム会員登録するとプレミアム会員になる() {

    }

    @Test
    void 現在が通常会員の場合に退会するとゲストユーザーになる() {

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