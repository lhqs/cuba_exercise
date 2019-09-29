package com.fugang.tuzhuang.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TUZHUANG_WORK_ORDER")
@Entity(name = "tuzhuang_WorkOrder")
public class WorkOrder extends StandardEntity {
    private static final long serialVersionUID = 2386334633679889946L;

    @NotNull
    @Column(name = "SERIAL", nullable = false)
    protected String serial;

    @Lookup(type = LookupType.DROPDOWN)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_LINE_ID")
    protected ProductLine productLine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @Column(name = "PLAN_NUM")
    protected Long planNum;

    @Column(name = "FINISH_NUM")
    protected Long finishNum;

    @Column(name = "START_TIME")
    protected LocalDateTime startTime;

    @Column(name = "END_TIME")
    protected LocalDateTime endTime;

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Long getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
    }

    public Long getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Long planNum) {
        this.planNum = planNum;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}