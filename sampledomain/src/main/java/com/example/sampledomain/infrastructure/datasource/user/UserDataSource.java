package com.example.sampledomain.infrastructure.datasource.user;

import com.example.sampledomain.application.repository.UserRepository;
import com.example.sampledomain.domain.model.user.User;
import com.example.sampledomain.domain.model.user.UserApplication;
import com.example.sampledomain.domain.model.user.UserIdentifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserDataSource implements UserRepository {

    @Override
    public void saveApplication(UserApplication userApplication) {

    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public boolean exists(UserIdentifier userIdentifier) {
        return false;
    }

    @Override
    public boolean existsApplication(UserIdentifier userIdentifier) {
        return false;
    }

    @Override
    public UserApplication currentApplication(UserIdentifier userIdentifier) {
        return null;
    }
}
