package com.fugang.tuzhuang.service;

import com.fugang.tuzhuang.entity.UserInfo;

import java.util.List;

public interface UserService {
    String NAME = "tuzhuang_UserService";

    List<UserInfo> getUserList(String list);
    UserInfo getUserInfo(String username);
}