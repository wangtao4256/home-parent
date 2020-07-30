package com.home.wangtao.homeadmin.service;

import com.home.wangtao.homeadmin.entity.UserDO;

public interface UserService {
    UserDO findByUserName(String userName);

    void save(UserDO userDO);
}
