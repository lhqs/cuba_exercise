package com.fugang.tuzhuang.web.screens.workorder;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.WorkOrder;

@UiController("tuzhuang_WorkOrder.edit")
@UiDescriptor("work-order-edit.xml")
@EditedEntityContainer("workOrderDc")
@LoadDataBeforeShow
public class WorkOrderEdit extends StandardEditor<WorkOrder> {
}