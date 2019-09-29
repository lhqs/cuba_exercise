package com.fugang.tuzhuang.web.screens.workorder;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.WorkOrder;

@UiController("tuzhuang_WorkOrder.browse")
@UiDescriptor("work-order-browse.xml")
@LookupComponent("workOrdersTable")
@LoadDataBeforeShow
public class WorkOrderBrowse extends StandardLookup<WorkOrder> {
}