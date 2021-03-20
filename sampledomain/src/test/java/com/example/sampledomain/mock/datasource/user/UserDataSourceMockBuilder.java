package com.example.sampledomain.mock.datasource.user;

import com.example.sampledomain.domain.model.user.ApplicationDateTime;
import com.example.sampledomain.domain.model.user.ApplicationState;
import com.example.sampledomain.domain.model.user.User;
import com.example.sampledomain.domain.model.user.UserApplication;
import com.example.sampledomain.infrastructure.datasource.user.UserDataSource;
import org.mockito.Mockito;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;

public class UserDataSourceMockBuilder {
    public static UserDataSource ゲストユーザーの状態を返すmock() {
        UserDataSource mock = Mockito.mock(UserDataSource.class);
        Mockito.doReturn(true).when(mock).exists(any());
        Mockito.doReturn(false).when(mock).existsApplication(any());

        return mock;
    }

    public static UserDataSource 会員申し込み済み状態を返すmock(User user) {
        UserDataSource mock = Mockito.mock(UserDataSource.class);
        Mockito.doReturn(true).when(mock).exists(any());
        Mockito.doReturn(true).when(mock).existsApplication(any());

        UserApplication userApplication = new UserApplication(
                user,
                ApplicationState.会員登録,
                new ApplicationDateTime(LocalDateTime.now())
        );
        Mockito.doReturn(userApplication).when(mock).currentApplication(any());

        return mock;
    }
}
