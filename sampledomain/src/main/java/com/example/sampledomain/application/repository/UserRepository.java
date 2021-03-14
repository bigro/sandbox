package com.example.sampledomain.application.repository;

import com.example.sampledomain.domain.model.user.User;
import com.example.sampledomain.domain.model.user.UserApplication;
import com.example.sampledomain.domain.model.user.UserIdentifier;

public interface UserRepository {
    UserApplication getApplication(UserIdentifier userIdentifier);
}
