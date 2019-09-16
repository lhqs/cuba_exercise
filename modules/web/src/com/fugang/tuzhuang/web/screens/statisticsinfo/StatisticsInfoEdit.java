package com.fugang.tuzhuang.web.screens.statisticsinfo;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.StatisticsInfo;

@UiController("tuzhuang_StatisticsInfo.edit")
@UiDescriptor("statistics-info-edit.xml")
@EditedEntityContainer("statisticsInfoDc")
@LoadDataBeforeShow
public class StatisticsInfoEdit extends StandardEditor<StatisticsInfo> {
}