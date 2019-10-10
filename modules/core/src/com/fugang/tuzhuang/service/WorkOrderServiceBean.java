package com.fugang.tuzhuang.service;

import com.fugang.tuzhuang.entity.WorkOrder;
import com.fugang.tuzhuang.entity.WorkOrderVO;
import com.haulmont.cuba.core.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

@Service(WorkOrderService.NAME)
public class WorkOrderServiceBean implements WorkOrderService {

    @Inject
    private Persistence persistence;

    @Override
    public Integer getCount(String number) {
        System.out.println("number:  :  :" + number);
        int orderCount = 0;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            orderCount = (Integer) em.createQuery("select t.plan_num  from tuzhuang_WorkOrder t")
                    .getSingleResult();
            tx.commit();
        }

        return orderCount;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void sqlTest() {
//        Transaction tx = persistence.createTransaction();
        Query query = persistence.getEntityManager().createNativeQuery(
                "select t.serial, t.plan_num  from tuzhuang_work_order t where 1 = ?1");
        query.setParameter(1, 1);
        List list = query.getResultList();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Object[] row = (Object[]) it.next();
            String id = (String) row[0];
            Long name = (Long) row[1];
            System.out.println("id: " + id + "; planNum: " + name);
        }
//        tx.commit();
//        tx.close();
    }

    @Transactional
    @Override
    public void sqlTest2() {
//        String st = "000001";
        TypedQuery<WorkOrder> query = persistence.getEntityManager().createNativeQuery(
                "select * from tuzhuang_work_order t where t.serial = '000001'",
                WorkOrder.class
        );
        System.out.println("start..... ");
//        query.setParameter(1, "000001");
        List<WorkOrder> resultList = query.getResultList();

        for (WorkOrder w : resultList) {

            System.out.println("---" + w.getSerial());
            System.out.println(w.getPlanNum());
            System.out.println(w.getProduct().getProductName());
        }

    }

    @Override
    @Transactional
    public WorkOrderVO GetWorkOrderBySerial(String serial) {
        System.out.println("serial: " + serial);
        TypedQuery<WorkOrder> query = persistence.getEntityManager().createNativeQuery(
                "select * from tuzhuang_work_order t where t.serial = ?1",
                WorkOrder.class
        );
        query.setParameter(1, serial);
        WorkOrder resultList = query.getSingleResult();
        WorkOrderVO wvo  = new WorkOrderVO();
        wvo.setSerial(resultList.getSerial());
        wvo.setDefinition(resultList.getProductLine().getDefinition());
        wvo.setProductName(resultList.getProduct().getProductName());
        wvo.setPlanNum(resultList.getPlanNum());
        wvo.setFinishNum(resultList.getFinishNum());
        wvo.setStartTime(resultList.getStartTime());
        wvo.setEndTime(resultList.getEndTime());
        System.out.println(wvo);
        return wvo;
    }


}