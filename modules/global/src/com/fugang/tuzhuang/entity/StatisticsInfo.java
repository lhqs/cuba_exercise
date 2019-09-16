package com.fugang.tuzhuang.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TUZHUANG_STATISTICS_INFO")
@Entity(name = "tuzhuang_StatisticsInfo")
public class StatisticsInfo extends StandardEntity {
    private static final long serialVersionUID = 5083712395638397751L;

    @NotNull
    @Column(name = "STATISTIC_ITEM", nullable = false)
    protected String statisticItem;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    protected Integer number;

    @NotNull
    @Column(name = "STATISTIC_TIME", nullable = false)
    protected LocalDateTime statisticTime;

    public LocalDateTime getStatisticTime() {
        return statisticTime;
    }

    public void setStatisticTime(LocalDateTime statisticTime) {
        this.statisticTime = statisticTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStatisticItem() {
        return statisticItem;
    }

    public void setStatisticItem(String statisticItem) {
        this.statisticItem = statisticItem;
    }
}