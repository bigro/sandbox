package com.example.sampledomain.application.service;

import com.example.sampledomain.application.repository.UserRepository;
import com.example.sampledomain.domain.model.guest.Guest;
import com.example.sampledomain.domain.model.user.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 会員登録
     */
    public void registerMember(Guest guest) {
        userRepository.saveUser(guest.user());

        UserApplication userApplication = new UserApplication(
                guest.user(),
                ApplicationState.会員登録,
                new ApplicationDateTime(LocalDateTime.now())
        );
        userRepository.saveApplication(userApplication);
    }

    /**
     * ユーザーを取得する
     */
    public User user(UserIdentifier userIdentifier) {
        if (!userRepository.exists(userIdentifier)) {
            throw new IllegalArgumentException("ユーザーが存在しません。");
        }

        if (!userRepository.existsApplication(userIdentifier)) {
            return User.guest(userIdentifier);
        }

        UserApplication userApplication = userRepository.currentApplication(userIdentifier);
        UserType userType = userApplication.appliedUserType();
        return new User(userIdentifier, userType);
    }
}
