package com.fugang.tuzhuang.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NamePattern("%s|productName")
@Table(name = "TUZHUANG_PRODUCT")
@Entity(name = "tuzhuang_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 2914710990892745521L;

    @NotNull
    @Column(name = "PRODUCT_IDSS", nullable = false)
    protected String productIdss;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false)
    protected String productName;

    @NotNull
    @Column(name = "CREATE_TIME", nullable = false)
    protected LocalDateTime createTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIdss() {
        return productIdss;
    }

    public void setProductIdss(String productIdss) {
        this.productIdss = productIdss;
    }
}