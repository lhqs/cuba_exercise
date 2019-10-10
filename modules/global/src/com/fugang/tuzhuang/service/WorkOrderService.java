package com.fugang.tuzhuang.service;

import com.fugang.tuzhuang.entity.WorkOrder;
import com.fugang.tuzhuang.entity.WorkOrderVO;

import java.math.BigDecimal;

public interface WorkOrderService {
    String NAME = "tuzhuang_WorkOrderService";

    Integer getCount(String number);

    void sqlTest();

    void sqlTest2();

    WorkOrderVO GetWorkOrderBySerial(String serial);


}