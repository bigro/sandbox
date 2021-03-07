package com.example.sampledomain.domain.model.campaign;

import java.math.BigDecimal;

/**
 * 割引率
 */
public enum DiscountRate {
    割引20パーセント(BigDecimal.valueOf(1.2)),
    割引10パーセント(BigDecimal.valueOf(1.1)),
    割引5パーセント(BigDecimal.valueOf(1.05)),
    割引なし(BigDecimal.valueOf(1));

    BigDecimal rate;

    DiscountRate(BigDecimal rate) {
        this.rate = rate;
    }

}
