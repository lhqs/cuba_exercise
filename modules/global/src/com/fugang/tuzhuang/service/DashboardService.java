package com.fugang.tuzhuang.service;

import java.math.BigDecimal;
import java.util.List;

public interface DashboardService {
    String NAME = "tuzhuang_DashboardService";
    List<BigDecimal> numList();
    Integer getRate();
}