package com.example.sampledomain.domain.model.user;

import java.time.LocalDateTime;

/**
 * 申し込み日時
 */
public class ApplicationDateTime {
    LocalDateTime value;

    public ApplicationDateTime(LocalDateTime value) {
        this.value = value;
    }

    public ApplicationApplyStatus monthLessThan(LocalDateTime dateTime) {
        // TODO: ほんとは条件を満たしていたら適用、そうじゃない場合は未適用を返す
        return ApplicationApplyStatus.適用;
    }
}
