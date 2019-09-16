package com.fugang.tuzhuang.service;

import com.fugang.tuzhuang.entity.Sex;
import com.fugang.tuzhuang.entity.UserInfo;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(UserService.NAME)
public class UserServiceBean implements UserService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<UserInfo> getUserList(String list) {
        List<UserInfo> lists = new ArrayList<>(4);
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("one");
        userInfo.setSex(Sex.MAN);
        userInfo.setMobilePhone("123123123");
        userInfo.setCreateTime(LocalDateTime.now());

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUsername("one");
        userInfo2.setSex(Sex.MAN);
        userInfo2.setMobilePhone("123123123");
        userInfo2.setCreateTime(LocalDateTime.now());

        lists.add(userInfo);
        lists.add(userInfo2);

        return lists;
    }

    @Override
    public UserInfo getUserInfo(String username) {
        LoadContext<UserInfo> userInfoLoadContext = LoadContext.create(UserInfo.class)
                .setQuery(LoadContext.createQuery("select c from tuzhuang_UserInfo c where c.username = :username")
                        .setParameter("username", username))
                .setView("_local");

        UserInfo load = dataManager.load(userInfoLoadContext);
        return load;
    }
}