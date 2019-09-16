package com.fugang.tuzhuang.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TUZHUANG_DEVICE")
@Entity(name = "tuzhuang_Device")
public class Device extends StandardEntity {
    private static final long serialVersionUID = -2159463830535530762L;

    @NotNull
    @Column(name = "DEVICE_NAME", nullable = false)
    protected String deviceName;

    @NotNull
    @Column(name = "DEVICE_STATUS", nullable = false)
    protected Integer deviceStatus;

    @NotNull
    @Column(name = "WORK_TIME", nullable = false)
    protected LocalDateTime workTime;

    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus == null ? null : deviceStatus.getId();
    }

    public DeviceStatus getDeviceStatus() {
        return deviceStatus == null ? null : DeviceStatus.fromId(deviceStatus);
    }

    public LocalDateTime getWorkTime() {
        return workTime;
    }

    public void setWorkTime(LocalDateTime workTime) {
        this.workTime = workTime;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}