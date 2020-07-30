package com.home.wangtao.homeadmin.service.impl;

import com.home.wangtao.homeadmin.service.UserDetailService;
import com.home.wangtao.homeadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserDetails userDetails = userService.findByUserName(userName);
        if (null == userDetails) {
            throw new UsernameNotFoundException("username" + userName + "not found");
        }
        return userDetails;
    }
}
