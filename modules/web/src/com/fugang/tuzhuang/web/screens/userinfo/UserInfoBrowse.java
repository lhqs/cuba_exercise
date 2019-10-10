package com.fugang.tuzhuang.web.screens.userinfo;


import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.screen.*;
import com.fugang.tuzhuang.entity.UserInfo;

import javax.inject.Named;

@UiController("tuzhuang_UserInfo.browse")
@UiDescriptor("user-info-browse.xml")
@LookupComponent("userInfoesTable")
@LoadDataBeforeShow
public class UserInfoBrowse extends StandardLookup<UserInfo> {


}