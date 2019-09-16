package com.fugang.tuzhuang.web.screens.device;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.Device;

@UiController("tuzhuang_Device.browse")
@UiDescriptor("device-browse.xml")
@LookupComponent("devicesTable")
@LoadDataBeforeShow
public class DeviceBrowse extends StandardLookup<Device> {
}