package com.example.sampledomain.domain.model.user;

import java.time.LocalDateTime;

/**
 * ユーザー申し込み
 */
public class UserApplication {
    User user;
    ApplicationState state;
    ApplicationDateTime dateTime;

    public UserApplication(User user, ApplicationState state, ApplicationDateTime dateTime) {
        this.user = user;
        this.state = state;
        this.dateTime = dateTime;
    }

    public ApplicationState state() {
        return state;
    }

    public UserTransitionCondition toTransitionCondition() {
        if (state == ApplicationState.プレミアム解除) {
            return new UserTransitionCondition(user.type(), state, dateTime.monthLessThan(LocalDateTime.now()));
        }

        return new UserTransitionCondition(user.type(), state, ApplicationApplyStatus.適用);
    }

    public UserType appliedUserType() {
        UserTransitionTable transitionTable = new UserTransitionTable();
        if (state == ApplicationState.プレミアム解除) {
            UserTransitionCondition transitionCondition = new UserTransitionCondition(user.type(), state, dateTime.monthLessThan(LocalDateTime.now()));
            return transitionTable.of(transitionCondition);
        }

        UserTransitionCondition transitionCondition = new UserTransitionCondition(user.type(), state, ApplicationApplyStatus.適用);
        return transitionTable.of(transitionCondition);
    }
}
