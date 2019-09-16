package com.fugang.tuzhuang.web.screens.userinfo;

import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.UserInfo;

@UiController("tuzhuang_UserInfo.edit")
@UiDescriptor("user-info-edit.xml")
@EditedEntityContainer("userInfoDc")
@LoadDataBeforeShow
public class UserInfoEdit extends StandardEditor<UserInfo> {
}