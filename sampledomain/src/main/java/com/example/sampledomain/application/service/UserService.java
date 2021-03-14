package com.example.sampledomain.application.service;

import com.example.sampledomain.application.repository.UserRepository;
import com.example.sampledomain.domain.model.user.*;

public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserType getUserType(UserIdentifier userIdentifier) {
        UserApplication application = userRepository.getApplication(userIdentifier);

        UserTransitionCondition transitionCondition = application.toTransitionCondition();

        UserTransitionTable transitionTable = new UserTransitionTable();
        return transitionTable.of(transitionCondition);
    }
}
