package com.home.wangtao.homeadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.home.wangtao.homeadmin.dao.UserDao;
import com.home.wangtao.homeadmin.entity.UserDO;
import com.home.wangtao.homeadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserDO findByUserName(String userName) {
        if (null == userName) {
            return null;
        }
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", userName);
        UserDO userDO = userDao.selectOne(wrapper);
        return userDO;
    }

    @Override
    public void save(UserDO userDO) {
        if (null == userDO) {
            return;
        }
        userDao.insert(userDO);
    }
}
