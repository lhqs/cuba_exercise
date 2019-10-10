package com.fugang.tuzhuang.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service(DashboardService.NAME)
public class DashboardServiceBean implements DashboardService {

    @Inject
    private Persistence persistence;

    @Override
    @Transactional
    public List<BigDecimal> numList() {
        List<BigDecimal> resultList = new ArrayList<>(2);
        Query query = persistence.getEntityManager().createNativeQuery(
                "SELECT sum(plan_num) as planNum, sum(finish_num) as finishNum FROM tuzhuang_work_order");
        List list = query.getResultList();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Object[] row = (Object[]) it.next();
            BigDecimal planNum = (BigDecimal) row[0];
            BigDecimal finishNum = (BigDecimal) row[1];
            System.out.println("planNum: " + planNum + "; finishNum: " + finishNum);
            resultList.add(planNum);
            resultList.add(finishNum);
        }
        return resultList;
    }

    @Override
    @Transactional
    public Integer getRate() {
        return null;
    }
}