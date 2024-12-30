package com.example.demo.entities;

public enum OfficialEnum {
    F(0),
    T(1);

    final private int value;

    OfficialEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
