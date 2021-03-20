package com.example.sampledomain.domain.model.user;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTransitionCondition that = (UserTransitionCondition) o;
        return currentType == that.currentType &&
                state == that.state &&
                applicationApplyStatus == that.applicationApplyStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentType, state, applicationApplyStatus);
    }
}
