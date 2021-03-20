package com.example.sampledomain.application.repository;

import com.example.sampledomain.domain.model.user.User;
import com.example.sampledomain.domain.model.user.UserApplication;
import com.example.sampledomain.domain.model.user.UserIdentifier;

public interface UserRepository {

    void saveApplication(UserApplication userApplication);

    void saveUser(User user);

    boolean exists(UserIdentifier userIdentifier);

    boolean existsApplication(UserIdentifier userIdentifier);

    UserApplication currentApplication(UserIdentifier userIdentifier);
}
