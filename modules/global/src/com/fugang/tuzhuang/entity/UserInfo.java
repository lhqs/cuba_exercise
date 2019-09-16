package com.fugang.tuzhuang.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TUZHUANG_USER_INFO")
@Entity(name = "tuzhuang_UserInfo")
public class UserInfo extends StandardEntity {
    private static final long serialVersionUID = -9183573472551235429L;

    @NotNull
    @Column(name = "USERNAME", nullable = false)
    protected String username;

    @NotNull
    @Column(name = "SEX", nullable = false)
    protected Integer sex;

    @NotNull
    @Column(name = "MOBILE_PHONE", nullable = false)
    protected String mobilePhone;

    @NotNull
    @Column(name = "CREATE_TIME", nullable = false)
    protected LocalDateTime createTime;

    public void setSex(Sex sex) {
        this.sex = sex == null ? null : sex.getId();
    }

    public Sex getSex() {
        return sex == null ? null : Sex.fromId(sex);
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}