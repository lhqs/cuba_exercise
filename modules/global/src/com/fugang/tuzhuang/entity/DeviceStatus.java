package com.fugang.tuzhuang.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DeviceStatus implements EnumClass<Integer> {

    RUN(1),
    STOP(2),
    BROKEN(3);

    private Integer id;

    DeviceStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static DeviceStatus fromId(Integer id) {
        for (DeviceStatus at : DeviceStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}