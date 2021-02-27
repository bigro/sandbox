package com.example.sampledomain.domain.model.point;

/**
 * ポイント数
 */
public class PointAmount {
    private int value;

    public PointAmount(int value) {
        this.value = value;
    }

    public PointAmount add(PointAmount other) {
        return new PointAmount(value + other.value);
    }

    public PointAmount subtraction(PointAmount other) {
        return new PointAmount(value - other.value);
    }
}
