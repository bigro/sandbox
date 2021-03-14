package com.example.sampledomain.domain.model.user;

import java.util.HashMap;
import java.util.Map;

/**
 * ユーザー遷移表
 */
public class UserTransitionTable {
    Map<UserTransitionCondition, UserType> map = new HashMap<>();

    public UserTransitionTable() {
        map.put(new UserTransitionCondition(UserType.ゲスト, ApplicationState.会員登録, ApplicationApplyStatus.適用), UserType.会員);
        map.put(new UserTransitionCondition(UserType.会員, ApplicationState.プレミアム会員登録, ApplicationApplyStatus.適用), UserType.プレミアム会員);
        map.put(new UserTransitionCondition(UserType.会員, ApplicationState.退会, ApplicationApplyStatus.適用), UserType.ゲスト);
        map.put(new UserTransitionCondition(UserType.プレミアム会員, ApplicationState.プレミアム解除, ApplicationApplyStatus.適用), UserType.会員);
        map.put(new UserTransitionCondition(UserType.プレミアム会員, ApplicationState.退会, ApplicationApplyStatus.適用), UserType.ゲスト);
    }

    public UserType of(UserTransitionCondition condition) {
        if (condition.applyStatus() == ApplicationApplyStatus.未適用) {
            return condition.currentType();
        }

        UserType nextType = map.get(condition);
        if (nextType == null) {
            throw new IllegalArgumentException("遷移条件が存在しません。");
        }

        return nextType;
    }
}
