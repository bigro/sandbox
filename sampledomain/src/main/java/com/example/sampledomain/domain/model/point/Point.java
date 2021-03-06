package com.example.sampledomain.domain.model.point;

import com.example.sampledomain.domain.model.member.Member;

/**
 * ポイント
 */
public class Point {
    Member member;
    PointAmount amount;

    /**
     * ポイントが使用可能か？
     */
    public PointStatus canUse(PointAmount pointAmount) {
        if (amount.greaterThen(pointAmount)) {
            return PointStatus.使用可能;
        }

        return PointStatus.残高不足;
    }
}
