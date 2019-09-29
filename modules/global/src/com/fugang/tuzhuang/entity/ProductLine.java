package com.fugang.tuzhuang.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TUZHUANG_PRODUCT_LINE")
@Entity(name = "tuzhuang_ProductLine")
public class ProductLine extends StandardEntity {
    private static final long serialVersionUID = 3493715789244802623L;

    @NotNull
    @Column(name = "SERIAL", nullable = false)
    protected String serial;

    @NotNull
    @Column(name = "DEFINITION_", nullable = false)
    protected String definition;

    @NotNull
    @Column(name = "CREATE_TIME", nullable = false)
    protected LocalDateTime createTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}