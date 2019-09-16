package com.fugang.tuzhuang.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Sex implements EnumClass<Integer> {

    WOMAN(0),
    MAN(1);

    private Integer id;

    Sex(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Sex fromId(Integer id) {
        for (Sex at : Sex.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}