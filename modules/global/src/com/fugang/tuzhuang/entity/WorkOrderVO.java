package com.fugang.tuzhuang.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

//@MetaClass(name = "tuzhuang_WorkOrderVO")
public class WorkOrderVO implements Serializable {
    private static final long serialVersionUID = -2284580784331292628L;

    private String serial;

    private String productName;

    private String definition;

    private String product;


    private Long planNum;


    private Long finishNum;


    private LocalDateTime startTime;


    private LocalDateTime endTime;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Long planNum) {
        this.planNum = planNum;
    }

    public Long getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "WorkOrderVO{" +
                "serial='" + serial + '\'' +
                ", productName='" + productName + '\'' +
                ", definition='" + definition + '\'' +
                ", product='" + product + '\'' +
                ", planNum=" + planNum +
                ", finishNum=" + finishNum +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}