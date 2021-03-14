package com.example.sampledomain.domain.model.user;

/**
 * ユーザー遷移条件
 */
public class UserTransitionCondition {
    UserType currentType;
    ApplicationState state;
    ApplicationApplyStatus applicationApplyStatus;

    public UserTransitionCondition(UserType currentType, ApplicationState state, ApplicationApplyStatus applicationApplyStatus) {
        this.currentType = currentType;
        this.state = state;
        this.applicationApplyStatus = applicationApplyStatus;
    }

    public UserType currentType() {
        return currentType;
    }

    public ApplicationApplyStatus applyStatus() {
        return applicationApplyStatus;
    }
}
