package com.fugang.tuzhuang.web.screens.statisticsinfo;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.StatisticsInfo;

@UiController("tuzhuang_StatisticsInfo.browse")
@UiDescriptor("statistics-info-browse.xml")
@LookupComponent("statisticsInfoesTable")
@LoadDataBeforeShow
public class StatisticsInfoBrowse extends StandardLookup<StatisticsInfo> {
}